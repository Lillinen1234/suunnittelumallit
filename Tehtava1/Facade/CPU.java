package Facade;

public class CPU {
    private int position;
    private Memory memory;

    public CPU(Memory memory) {
        position = 0;
        this.memory = memory;
    }

    public void freeze() {
        System.out.println("Freezing cpu");
    }

    public void jump(int position) {
        System.out.println("Jumping to position "+position);
        this.position = position;
    }

    public void execute() {
        char command = memory.getData(position);
        if (command == 'j') {
            int nextPost = memory.getData(++position);
            System.out.println("Jumping to position "+ nextPost);
            position = nextPost;
            return;
        }
        System.out.println("Command "+command+" executed in position "+position);
        position++;
    }

    public boolean isExecutable() {
        int next = position + 1;
        char command = memory.getData(next);
        if (command=='\u0000')
            return false;

        return true;
    }
}
