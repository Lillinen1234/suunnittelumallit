package AbstractFactory;

import java.util.ArrayList;

public class Jasper {
    private final ArrayList<VaateKappale> vaatteet = new ArrayList<>();

    public void lisaaVaate(VaateKappale vaate){
        vaatteet.add(vaate);
    }

    public void poistaVaatteet(){
        vaatteet.clear();
    }

    public void kuvaileVaatteet(){
        String[] vaateKappaleet = vaatteet.stream().map(VaateKappale::toString).toArray(String[]::new);
        System.out.printf("Päälläni on %s\n", String.join(", ", vaateKappaleet));
    }
}
