package Composite;

import lombok.Getter;

public class Prosessori extends Komponentti {
    @Getter private final int hinta;

    public Prosessori(String nimi, int hinta){
        super(nimi, hinta);
        this.hinta = hinta;
    }

    public int haeHinta() {
        return hinta;
    }
}
