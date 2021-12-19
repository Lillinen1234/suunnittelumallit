package Decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodedTextWriter extends TextWriterDecorator{

    public EncodedTextWriter(ITextWriter writer) {
        super(writer);
    }

    @Override
    public boolean writeToFile() {
        super.setText(encodeString(super.getText()));
        return super.writeToFile();
    }

    @Override
    public boolean readFromFile() {
        if (super.readFromFile()) {
            super.setText(decodeString(super.getText()));
            return true;
        }

        return false;
    }

    private String encodeString(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }

    private String decodeString(String text) {
        return new String(Base64.getDecoder().decode(text));
    }
}

