package Facade;

import java.util.Arrays;

public class Memory {
    private char[] memory;

    public Memory() {
        memory = new char[256];
    }

    public void load(int position, char[] data) {
        System.out.println("Loading data: "+ Arrays.toString(data)+ " to memory location: "+position);

        for (int i = position; i < position+data.length; i++) {
            memory[i] = data[i-position];
        }
    }

    protected char getData(int position) {
        return memory[position];
    }
}
