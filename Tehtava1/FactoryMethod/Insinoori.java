package factorymethod;

public class Insinoori extends AterioivaOtus {

    public Ruoka createRuoka(){
        return new Keitto();
    }
    public Juoma createJuoma() {
        return new Maito();
    }
}
