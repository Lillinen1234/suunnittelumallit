package Builder;

public class Waiter {
    private IBurgerBuilder builder;

    public void setBuilder(IBurgerBuilder builder) {
        this.builder = builder;
    }

    public void constructHamburger() {
        this.builder.createNewHamburger();
        this.builder.buildBun();
        this.builder.buildBeef();
        this.builder.buildCheese();
        this.builder.buildLettuce();
        this.builder.buildTomato();
    }
}
