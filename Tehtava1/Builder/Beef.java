package Builder;

public class Beef implements BurgerPart{
    private String beefType;

    public Beef(String type) {
        this.beefType = type;
    }

    @Override
    public String getPart() {
        return this.beefType;
    }
}
