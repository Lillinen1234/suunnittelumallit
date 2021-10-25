package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Ruoka createRuoka(){
        return new Salaatti();
    }
    public Juoma createJuoma(){
        return new Vesi();
    };

}
