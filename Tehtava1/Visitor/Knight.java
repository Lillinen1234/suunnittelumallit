package Visitor;

public class Knight implements Fighter{
    private final int attack = 30;

    @Override
    public int attack() {
        System.out.println("The Knight attacks with precision and skill");
        return attack;
    }

    @Override
    public void takeDamage(int dmg) {
        System.out.println("The Knight parries the enemy's attack with ease");
    }

    @Override
    public String getName() {
        return "Knight";
    }
}
