package State;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Charmander extends EvolutionStage{
    @Getter
    private static final Charmander instance = new Charmander();

    @Override
    protected void attack() {
        System.out.println("Charmander attacks with Blaze! It wasn't very effective!");
    }
}
