package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus insinoori = new Insinoori();

        opettaja.aterioi();
        opiskelija.aterioi();
        insinoori.aterioi();
    }
}
