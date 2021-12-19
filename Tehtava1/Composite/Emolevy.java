package Composite;

import lombok.Getter;

public class Emolevy extends KokoaKone {
    @Getter private final int hinta;

    public Emolevy(String nimi, int hinta){
        super(nimi, hinta);
        this.hinta = hinta;
    }

    public int haeHinta() {
        return hinta;
    }
}
