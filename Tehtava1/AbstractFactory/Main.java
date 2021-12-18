package AbstractFactory;

import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args){
        Jasper jasper = new Jasper();
        AdidasTehdas adidasTehdas = new AdidasTehdas();
        BossTehdas bossTehdas = new BossTehdas();

        pue(jasper, adidasTehdas);
        pue(jasper, bossTehdas);
    }

    @SneakyThrows
    public static VaateTehdas luoTehdas(String tehdasNimi) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (VaateTehdas)
                Class.forName("%s".formatted(tehdasNimi))
                        .getDeclaredConstructor()
                        .newInstance();
    }

    public static void pue(Jasper jasper, VaateTehdas tehdas){
        jasper.poistaVaatteet();
        jasper.lisaaVaate(tehdas.luoLippis());
        jasper.lisaaVaate(tehdas.luoTPaita());
        jasper.lisaaVaate(tehdas.luoFarkut());
        jasper.lisaaVaate(tehdas.luoKengat());
        jasper.kuvaileVaatteet();
    }
}
