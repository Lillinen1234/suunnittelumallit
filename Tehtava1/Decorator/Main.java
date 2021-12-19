package Decorator;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        ITextWriter writer = new EncodedTextWriter(new ReversedTextWriter(new TextWriter()));
        if (writer.readFromFile()) {
            System.out.print("Old text: ");
            System.out.println(writer.getText());
        }
        Scanner sc = new Scanner(System.in);

        System.out.print("What should be written in file: ");

        String in = sc.nextLine();

        writer.setText(in);

        writer.writeToFile();

        System.out.println(writer.getText()+ " written in file");
    }
}
