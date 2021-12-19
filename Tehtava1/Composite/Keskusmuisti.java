package Composite;

import lombok.Getter;

public class Keskusmuisti extends Komponentti {
    @Getter
    private final int hinta;

    public Keskusmuisti(String nimi, int hinta) {
        super(nimi, hinta);
        this.hinta = hinta;
    }

    public int haeHinta() {
        return hinta;
    }
}
