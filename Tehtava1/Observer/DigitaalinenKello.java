package Observer;

import java.util.Observable;
import java.util.Observer;

public class DigitaalinenKello implements Observer {
    private final Kello kello = Kello.getInstance();

    @Override
    public void update(Observable o, Object arg) {
        if (!(o instanceof Kello) || !(arg instanceof Long)){
            throw new IllegalArgumentException(
                    "Virhe kellon päivityksessä");
        }

        System.out.printf("\r%02d:%02d:%02d", kello.haeTunnit(), kello.haeMinuutit(), kello.haeSekunnit());
    }
}
