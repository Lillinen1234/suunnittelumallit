package Composite;


import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public abstract class Komponentti {
    private final String nimi;
    private final int hinta;

    public abstract int haeHinta();
}
