package AbstractFactory;

public abstract class Kengat extends VaateKappale{

    public abstract String haeMerkki();

    @Override
    public String toString(){
        return "%s-kengät".formatted(haeMerkki());
    }
}
