package Decorator;

public abstract class TextWriterDecorator implements ITextWriter{
    protected ITextWriter writer;

    public TextWriterDecorator(ITextWriter writer) {
        this.writer = writer;
    }

    public void setText(String text) {
        writer.setText(text);
    }

    public String getText() {
        return writer.getText();
    }

    public boolean writeToFile() {
        return writer.writeToFile();
    }

    public boolean readFromFile() {
        return writer.readFromFile();
    }
}
