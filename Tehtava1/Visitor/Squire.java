package Visitor;

public class Squire implements Fighter{
    private final int attack = 5;


    @Override
    public int attack() {
        System.out.println("The Squire swings his sword");
        return attack;
    }

    @Override
    public void takeDamage(int dmg) {
        System.out.println("Squire takes "+ dmg+ " hitpoints of damage");
        System.out.println("Squire survived the attack and keeps on fighting");

    }

    @Override
    public String getName() {
        return "Squire";
    }
}
