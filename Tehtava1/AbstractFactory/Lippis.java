package AbstractFactory;

public abstract class Lippis extends VaateKappale{

    public abstract String haeMerkki();

    @Override
    public String toString(){
        return "%s-lippis".formatted(haeMerkki());
    }
}
