package Visitor;

public class PlayerVisitor implements Visitor{
    private final int squireCap = 10;
    private final int warriorCap = 20;
    private final int KnightCap = 30;

    @Override
    public void visit(Player p) {
        int exp = p.getExp();

        if (exp <= 10) {
            return;
        } else if (exp <= 20) {
            if (p.getName().equals("Warrior"))
                return;
            System.out.println("### The Squire has been promoted to a Warrior ###");
            p.setState(new Warrior());
        } else if (exp <= 30) {
            if (p.getName().equals("Knight"))
                return;
            System.out.println("### The Warrior has been promoted to a Knight ###");
            p.setState(new Knight());
        }

    }
}
