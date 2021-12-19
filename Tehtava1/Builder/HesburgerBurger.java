package Builder;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBurger {
    private List<BurgerPart> parts;

    public HesburgerBurger() {
        this.parts = new ArrayList<>();
    }

    public void setBun(Bun bun) {
        this.parts.add(bun);
    }

    public void setBeef(Beef beef) {
        this.parts.add(beef);
    }

    public void setCheese(Cheese cheese) {
        this.parts.add(cheese);
    }

    public void setLettuce(Lettuce lettuce) {
        this.parts.add(lettuce);
    }

    public void setTomato(Tomato tomato) {
        this.parts.add(tomato);
    }

    public void getBurger() {
        System.out.println("Hesburger burger:");
        for (BurgerPart part : parts) {
            System.out.print(part.getPart()+", ");
        }
        System.out.println();
    }
}
