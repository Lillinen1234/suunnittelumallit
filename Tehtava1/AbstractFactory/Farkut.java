package AbstractFactory;


public abstract class Farkut extends VaateKappale {
    public abstract String haeMerkki();

    @Override
    public String toString(){
        return "%s-farkut".formatted(haeMerkki());
    }
}
