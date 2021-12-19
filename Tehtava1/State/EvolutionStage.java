package State;

public abstract class EvolutionStage {
    protected void changeStage(Pokemon pokemon, EvolutionStage stage) {
        System.out.printf(
                "Pokémon %s %s! It is now a %s.\n",
                pokemon.getName(),
                stage == Charmander.getInstance() ? "hatched" : "evolved",
                stage.getClass().getSimpleName());
        pokemon.changeStage(stage);
    }

    protected void evolveStage1(Pokemon pokemon) { // <=> hatch
        changeStage(pokemon, Charmander.getInstance());
    }

    protected void evolveStage2(Pokemon pokemon) {
        changeStage(pokemon, Charmeleon.getInstance());
    }

    protected void evolveStage3(Pokemon pokemon) {
        changeStage(pokemon, Charizard.getInstance());
    }

    protected abstract void attack();
}
