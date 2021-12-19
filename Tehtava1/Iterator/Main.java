package Iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> collection = new ArrayList<>();
        TestThread t1;
        TestThread t2;
        TestRemoveIterator tr1;

        String zero = "nolla";
        String one = "yksi";
        String two = "kaksi";
        String three = "kolme";
        String four = "neljä";

        collection.add(zero);
        collection.add(one);
        collection.add(two);
        collection.add(three);
        collection.add(four);

        Iterator<String> iterator = collection.iterator();
        Iterator<String> iterator2 = collection.iterator();

        switch (1) {
            case 1: //Kaksi säiettä, kaksi iteraattoria
                t1 = new TestThread(iterator, 1);
                t2 = new TestThread(iterator2, 2);

                t1.start();
                t2.start();
                break;

            case 2: //Kaksi säiettä, yksi iteraattori
                t1 = new TestThread(iterator, 1);
                t2 = new TestThread(iterator, 2);

                t1.start();
                t2.start();
                break;

            case 3: //Lisätään kokoelmaan
                t1 = new TestThread(iterator, 1);
                t1.start();
                collection.add(new String("viisi"));
                break;

            case 4: //iterator.Remove(), ilman break;
                tr1 = new TestRemoveIterator(iterator, 1);
                tr1.start();
                break;
        }
    }
}
