package Builder;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        IBurgerBuilder hesburgerBuilder = new HesburgerBurgerBuilder();
        IBurgerBuilder mcDonaldsBuilder = new McDonaldsBurgerBuilder();

        waiter.setBuilder(hesburgerBuilder);
        System.out.println("Waiter constructs a Hesburger burger");
        waiter.constructHamburger();

        HesburgerBurger hesburgerBurger = (HesburgerBurger) hesburgerBuilder.getHamburger();
        hesburgerBurger.getBurger();
        System.out.println();

        waiter.setBuilder(mcDonaldsBuilder);
        System.out.println("Waiter constructs a MacDonalds burger");
        waiter.constructHamburger();

        McDonaldsBurger mcDonaldsBurger = (McDonaldsBurger) mcDonaldsBuilder.getHamburger();

        mcDonaldsBurger.getBurger();
    }

}
