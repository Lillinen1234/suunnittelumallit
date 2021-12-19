package Iterator;

import java.util.Iterator;

public class TestRemoveIterator extends Thread{
    private Iterator<String> iterator;
    private int i;
    int j = 0;

    public TestRemoveIterator(Iterator<String> iterator, int i) {
        this.iterator = iterator;
        this.i = i;
    }

    public void run(){
        while (this.iterator.hasNext()) {

            if(this.iterator.next().equals("kaksi")) {
                this.iterator.remove();
                //break;
            }

            System.out.println("Iterator " + i + ", index " + j + ": " + this.iterator.next());
            j++;
        }
    }
}
