package Builder;

public interface IBurgerBuilder {
    public void createNewHamburger();
    public void buildBun();
    public void buildBeef();
    public void buildCheese();
    public void buildLettuce();
    public void buildTomato();
    public Object getHamburger();
}
