package Decorator;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextWriter implements ITextWriter{

    private String text;

    public TextWriter() {
        text = "";
    };

    public TextWriter(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public boolean writeToFile () {
        if (text == null || text.equals("")) {
            System.out.println("Nothing to write");
            return false;
        }
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write(this.text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not write to file!");
            return false;
        }
        return true;
    }

    public boolean readFromFile() {
        if (!text.equals("")) {
            System.out.println("Writer already has text inside");
            return false;
        }
        try {
            String file = Files.readString(Path.of("file.txt"));
            if (file.equals("")) {
                return false;
            }
            this.text = file;
        } catch (IOException e) {

        }

        return true;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
