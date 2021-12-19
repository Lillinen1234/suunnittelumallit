package Visitor;

public class Warrior implements Fighter{
    private final int attack = 10;

    @Override
    public int attack() {
        System.out.println("The Warrior attacks with fury");
        return 10;
    }

    @Override
    public void takeDamage(int dmg) {
        System.out.println("The warrior takes "+dmg+" hitpoints of damage");
        System.out.println("The warrior continues to fight");
    }

    @Override
    public String getName() {
        return "Warrior";
    }
}
