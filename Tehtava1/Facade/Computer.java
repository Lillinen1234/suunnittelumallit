package Facade;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    private int kBootAddress = 0;
    private int kBootSector = 2;
    private int kSectorSize = 16;

    public Computer() {
        memory = new Memory();
        cpu = new CPU(memory);
        hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
        cpu.jump(kBootAddress);
        while (cpu.isExecutable()) {
            cpu.execute();
        }
        cpu.freeze();
    }
}
