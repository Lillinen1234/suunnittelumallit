package Visitor;

public class Goblin implements Enemy{
    private int hp = 10;

    @Override
    public int attack() {
        System.out.println("The Goblin swipes with it's claws");
        return 3;
    }

    @Override
    public boolean takeDamage(int dmg) {
        System.out.println("The Goblin takes "+dmg+" hitpoints of damage");
        this.hp -=dmg;
        if (this.hp <= 0) {
            System.out.println("The Goblin dies from it's wounds");
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "Goblin";
    }

    @Override
    public int getExp() {
        return 5;
    }
}
