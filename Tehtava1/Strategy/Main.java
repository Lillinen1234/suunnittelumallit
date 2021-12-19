package Strategy;

import lombok.val;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        val list = new ArrayList<String>();

        for (int i = 0; i < 12; i++) {
            list.add("test");
        }

        System.out.println("Every:");
        Printers.print(new Printers.Every(), list);
        System.out.println("Every other:");
        Printers.print(new Printers.EveryOther(), list);
        System.out.println("Every third:");
        Printers.print(new Printers.EveryThird(), list);
    }
}
