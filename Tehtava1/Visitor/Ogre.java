package Visitor;

public class Ogre implements Enemy{
    private int hp = 15;
    @Override
    public int attack() {
        System.out.println("The Ogre swings it's hammer with might");
        return 10;
    }

    @Override
    public boolean takeDamage(int dmg) {
        this.hp -= dmg;
        System.out.println("The Ogre takes "+dmg+" hipoints of damage.");
        if (this.hp <= 0) {
            System.out.println("The Ogre crumbles and falls dead on the ground");
            return true;
        }
        System.out.println("The Ogre shouts and returns to the fight");
        return false;
    }

    @Override
    public String getName() {
        return "Ogre";
    }

    @Override
    public int getExp() {
        return 15;
    }
}
