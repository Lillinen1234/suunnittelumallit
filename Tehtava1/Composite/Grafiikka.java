package Composite;

import lombok.Getter;

public class Grafiikka extends Komponentti {
    @Getter private final int hinta;

    public Grafiikka(String nimi, int hinta) {
        super(nimi, hinta);
        this.hinta = hinta;
    }

    public int haeHinta() {
        return hinta;
    }
}
