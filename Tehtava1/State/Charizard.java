package State;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Charizard extends EvolutionStage {
    @Getter
    private static final Charizard instance = new Charizard();

    @Override
    protected void attack() {
        System.out.println("Charizard attacks with Solar Power! It was very effective!");
    }
}
