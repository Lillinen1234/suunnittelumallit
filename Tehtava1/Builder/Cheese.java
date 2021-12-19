package Builder;

public class Cheese implements BurgerPart{
    private String cheeseType;

    public Cheese(String type) {
        this.cheeseType = type;
    }

    @Override
    public String getPart() {
        return this.cheeseType;
    }
}
