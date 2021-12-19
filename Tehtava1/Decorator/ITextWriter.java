package Decorator;

public interface ITextWriter {
    void setText(String text);
    String getText();
    boolean writeToFile();
    boolean readFromFile();
}
