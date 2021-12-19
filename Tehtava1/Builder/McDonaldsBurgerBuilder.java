package Builder;

public class McDonaldsBurgerBuilder implements IBurgerBuilder{
    private McDonaldsBurger burger;

    @Override
    public void createNewHamburger() {
        this.burger = new McDonaldsBurger();
    }

    @Override
    public void buildBun() {
        this.burger.setPart("Burger bun");
    }

    @Override
    public void buildBeef() {
        this.burger.setPart("Quarter-pounder beef");
    }

    @Override
    public void buildCheese() {
        this.burger.setPart("Cheddar cheeze");
    }

    @Override
    public void buildLettuce() {
        this.burger.setPart("Lettuce");
    }

    @Override
    public void buildTomato() {
        this.burger.setPart("Tomato");
    }

    @Override
    public Object getHamburger() {
        return this.burger;
    }
}
