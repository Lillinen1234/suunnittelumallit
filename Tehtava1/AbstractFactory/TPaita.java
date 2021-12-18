package AbstractFactory;

public abstract class TPaita extends VaateKappale{

    public abstract String haeMerkki();

    @Override
    public String toString(){
        return "%s- t-paita".formatted(haeMerkki());
    }
}
