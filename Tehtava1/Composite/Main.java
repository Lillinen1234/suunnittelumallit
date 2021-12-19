package Composite;

import lombok.val;

public class Main {
    public static void main(String[] args){
        val tietokone = new Tietokone("HP Omen Obelisk 875-0098no", 100);
        tietokone.lisaaKomponentti(new Keskusmuisti("DDR4 2666 MHz 8Gt", 100));
        val emolevy = new Emolevy("Micro ATX", 100);
        emolevy.lisaaKomponentti(new Prosessori("Intel Core i7-8700", 352));
        emolevy.lisaaKomponentti(new Grafiikka("NVIDIA GeForce RTX 2080", 1000));
        emolevy.lisaaKomponentti(new Tallennustila("M.2 SSD 512Gt", 100));
        tietokone.lisaaKomponentti(emolevy);

        System.out.println(tietokone.haeKomponentit());
        System.out.println("Kokonaishinta: " + tietokone.haeKokonaisHinta());

    }
}
