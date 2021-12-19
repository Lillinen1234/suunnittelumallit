package Visitor;

public class Player {
    private Fighter state;
    private int exp;
    private PlayerVisitor visitor;

    public Player() {
        this.state = new Squire();
        this.exp = 0;
        this.visitor = new PlayerVisitor();
    }

    public void addExp(int exp) {
        System.out.println("The "+this.state.getName()+" has gained "+exp+" experience.");
        this.exp += exp;
        visitor.visit(this);
    }

    public int getExp() {
        return this.exp;
    }

    public String getName() {
        return this.state.getName();
    }

    public int attack() {
        return this.state.attack();
    }

    public void setState(Fighter state) {
        this.state = state;
    }

    public void takeDamage(int damage) {
        this.state.takeDamage(damage);
    }
}
