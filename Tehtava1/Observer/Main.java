package Observer;

public class Main {
    public static void main(String[] args) {
        Kello.getInstance().addObserver(new DigitaalinenKello());
    }
}
