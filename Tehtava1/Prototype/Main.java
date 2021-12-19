package Prototype;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Clock original = new Clock();
        Clock shallow = (Clock) original.clone();
        Clock deep = original.deepClone();

        Date date = new Date();
        long time = date.getTime();
        original.setTime(14, 3, 5);
        System.out.println("\n".repeat(4));
        System.out.println("The time is:");
        while (true) {
            date = new Date();
            long newTime = date.getTime();
            if (newTime - time > 1000) {
                original.advance();
                original.time();
                shallow.advance();
                shallow.time();
                deep.advance();
                deep.time();
                System.out.printf("\r%-10s %8s %10s %8s %10s %8s", "Original:", original.time(), "Shallow:", shallow.time(), "Deep:", deep.time());
                time = newTime;
            }
        }
    }
}
