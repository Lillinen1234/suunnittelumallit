package AbstractFactory;

public class AdidasTehdas implements VaateTehdas{
    private static final String merkki = "Adidas";

    @Override
    public Lippis luoLippis(){
        return new Lippis(){
            @Override
            public String haeMerkki(){
                return merkki;
            }
        };
    }

    @Override
    public TPaita luoTPaita(){
        return new TPaita(){
            @Override
            public String haeMerkki(){
                return merkki;
            }
        };
    }

    @Override
    public Farkut luoFarkut(){
        return new Farkut(){
            @Override
            public String haeMerkki(){
                return merkki;
            }
        };
    }

    @Override
    public Kengat luoKengat(){
        return new Kengat(){
            @Override
            public String haeMerkki(){
                return merkki;
            }
        };
    }

}
