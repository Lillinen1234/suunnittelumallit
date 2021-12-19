package State;

import lombok.SneakyThrows;
import lombok.val;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        val pokemon = new Pokemon("MammanMuru");

        //noinspection InfiniteLoopStatement
        while (true) {
            pokemon.attack();
            //noinspection BusyWait
            Thread.sleep(1000);
        }
    }
}
