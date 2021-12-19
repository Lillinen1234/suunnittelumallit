package Composite;

import lombok.Getter;

public class Tietokone extends KokoaKone {
    @Getter private final int hinta;

    public Tietokone(String nimi, int hinta){
        super(nimi, hinta);
        this.hinta = hinta;
    }

    public int haeHinta() {
        return hinta;
    }
}
