package Composite;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.val;

import java.util.ArrayList;

public abstract class KokoaKone extends Komponentti{
    @Getter(AccessLevel.PROTECTED)
    private final ArrayList<Komponentti> aliKomponentit = new ArrayList<>();

    public KokoaKone(String nimi, int hinta) {
        super(nimi, hinta);
    }

    public void lisaaKomponentti(Komponentti komponentti) {
        aliKomponentit.add(komponentti);
    }

    public int haeKokonaisHinta(){
        return haeKomponentit().stream().map(Komponentti::haeHinta).reduce(Integer::sum).get();
    }

    public ArrayList<Komponentti> haeKomponentit(){
        val komponentit = new ArrayList<Komponentti>();
        komponentit.add(this);
        aliKomponentit(this, komponentit);
        return komponentit;
    }

    private void  aliKomponentit(KokoaKone komponentti, ArrayList<Komponentti> komponentit){
        for (val komp : komponentti.getAliKomponentit()){
            komponentit.add(komp);

            if (komp instanceof KokoaKone){
                aliKomponentit((KokoaKone) komp, komponentit);
            }
        }
    }
}
