package Observer;

import lombok.Getter;
import lombok.val;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class Kello extends Observable {
    @Getter private static final Kello instance = new Kello();

    @Getter private static long aika = 0;

    private Kello() {
        new Timer()
                .scheduleAtFixedRate(
                        new TimerTask() {
                            @Override
                            public void run() {
                                tikita();
                            }
                        },
                        0,
                        1000);
    }

    private void tikita(){
        setChanged();
        aika++;
        notifyObservers(aika);
    }

    public long haeSekunnit(){
        val ylikirjoita = aika / 60;
        return ylikirjoita >= 1 ? aika - (ylikirjoita * 60) : aika;
    }

    public long haeMinuutit(){
        return (long) Math.floor(aika / 60);
    }

    public long haeTunnit(){
        return (long) Math.floor(aika / 60 / 60);
    }
}
