package factorymethod;

public class Opiskelija extends AterioivaOtus{

    public Ruoka createRuoka() {
        return new Pizza();
    }
    public Juoma createJuoma() {
        return new Mehu();
    }
}
