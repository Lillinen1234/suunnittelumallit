package Memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Riddler riddler = new Riddler();
        Guesser[] pArr = new Guesser[5];
        Thread[] tArr = new Thread[5];

        for (int i = 0; i < 5; i++) {
            pArr[i] = new Guesser(riddler);
            tArr[i] = new Thread(pArr[i]);
            tArr[i].start();
        }

        for (Thread t : tArr) {
            t.join();
        }
        System.out.println("All players finished!");

    }
}
