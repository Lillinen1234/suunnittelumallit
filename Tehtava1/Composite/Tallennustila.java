package Composite;

import lombok.Getter;

public class Tallennustila extends Komponentti {
    @Getter
    private final int hinta;

    public Tallennustila(String nimi, int hinta) {
        super(nimi, hinta);
        this.hinta = hinta;
    }

    public int haeHinta() {
        return hinta;
    }
}
