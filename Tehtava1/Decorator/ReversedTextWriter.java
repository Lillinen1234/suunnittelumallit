package Decorator;

public class ReversedTextWriter extends TextWriterDecorator{

    public ReversedTextWriter(ITextWriter writer) {
        super(writer);
    }

    @Override
    public boolean writeToFile() {
        super.setText(reverseText(super.getText()));
        return super.writeToFile();
    }

    @Override
    public boolean readFromFile() {
        if (super.readFromFile()) {
            super.setText(reverseText(super.getText()));
            return true;
        }

        return false;
    }

    private String reverseText(String text) {
        char[] reversedChars = new char[text.length()];
        char[] textChars = text.toCharArray();
        int textLength = textChars.length - 1;
        for (int i = textLength; i > -1; i--) {
            reversedChars[Math.abs(i-textLength)] = textChars[i];
        }

        return new String(reversedChars);
    }
}
