package Visitor;

public class Dragon implements Enemy{
    private int hp = 40;

    @Override
    public int attack() {
        return 30;
    }

    @Override
    public boolean takeDamage(int dmg) {
        System.out.println("The Dragon takes "+dmg+" hitpoints of damage.");
        this.hp -= dmg;
        if (this.hp <= 0) {
            System.out.println("The Dragon roars it's last and succumbs to it's wounds.");
            return true;
        }
        System.out.println("The Dragon brushes off the attack!");
        return false;
    }

    @Override
    public String getName() {
        return "Dragon";
    }

    @Override
    public int getExp() {
        return 25;
    }
}
