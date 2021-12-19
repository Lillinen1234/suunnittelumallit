package Builder;

public class HesburgerBurgerBuilder implements IBurgerBuilder{
    private HesburgerBurger burger;

    @Override
    public void createNewHamburger() {
        this.burger = new HesburgerBurger();
    }

    @Override
    public void buildBun() {
        this.burger.setBun(new Bun());
    }

    @Override
    public void buildBeef() {
        this.burger.setBeef(new Beef("Vegan beef"));
    }

    @Override
    public void buildCheese() {
        this.burger.setCheese(new Cheese("Vegan cheese"));
    }

    @Override
    public void buildLettuce() {
        this.burger.setLettuce(new Lettuce());
    }

    @Override
    public void buildTomato() {
        this.burger.setTomato(new Tomato());
    }

    @Override
    public Object getHamburger() {
        return this.burger;
    }
}
