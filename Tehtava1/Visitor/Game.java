package Visitor;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player p;
    private Enemy e;
    private Scanner sc;

    public Game() {
        p = new Player();
        e = null;
        sc = new Scanner(System.in);
    }

    public void mainLoop() {
        while (true) {
            e = getEnemy();
            System.out.println((e.getName()=="Ogre" ? "An " : "A ")+e.getName()+" approaches");
            System.out.printf("%10s Fight\n%10s Run away\n","1","2");
            String in = sc.nextLine();
            while (!in.equals("1")) {
                if (in.equals("2"))
                    System.exit(0);

                System.out.printf("%10s Fight\n%10s Run away\n","1","2");
                in = sc.nextLine();
            }
            clear();
            fight();
            sc.nextLine();
            clear();
        }
    }

    private void fight() {
        do {
            p.takeDamage(e.attack());
        } while (!e.takeDamage(p.attack()));
        System.out.println("The "+p.getName()+" has defeated the "+e.getName());
        p.addExp(e.getExp());
    }

    private Enemy getEnemy() {
        Random rand = new Random();
        int enemy = rand.nextInt(100);

        if (enemy < 54)
            return new Goblin();

        if (enemy < 79)
            return new Ogre();

        return new Dragon();
    }

    private void clear() {
        System.out.println("\n".repeat(50));
    }
}
