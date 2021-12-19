package State;

import lombok.Getter;

public class Pokemon {
    @Getter
    private final String name;
    private EvolutionStage evolutionStage = Charmander.getInstance();
    private int xp = 0;

    public Pokemon(String name) {
        this.name = name;
        evolutionStage.evolveStage1(this); // Hatch
    }

    public void attack() {
        xp++;

        System.out.printf("Pokémon %s now has %d XP.\n", name, xp);

        evolutionStage.attack();

        switch (xp) {
            case 20 -> evolutionStage.evolveStage3(this);
            case 10 -> evolutionStage.evolveStage2(this);
        }
    }

    protected void changeStage(EvolutionStage stage) {
        evolutionStage = stage;
    }
}
