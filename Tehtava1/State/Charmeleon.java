package State;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Charmeleon extends EvolutionStage{
    @Getter
    private static final Charmeleon instance = new Charmeleon();

    @Override
    protected void attack() {
        System.out.println("Charmeleon attacks with Tough Claws! It was effective!");
    }
}
