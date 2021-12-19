package Visitor;

public interface Enemy {
    public int attack();
    public boolean takeDamage(int dmg);
    public String getName();
    public int getExp();
}
