package Facade;

public class HardDrive {
    private char[] bootSector;

    public HardDrive() {
        bootSector = new char[] {
                0,0,'b','o','j',7,'i','j',12,'o','o','t','j',4,'n','g','!',0,0
        };
    }

    public char[] read(int lba, int size) {
        System.out.println("Reading sector: "+lba+", size of block: "+size);
        if (lba > bootSector.length) {
            return new char[0];
        }
        char[] arr = new char[size];
        int max = lba+size;
        int index = lba;
        while (index < max) {
            arr[index-lba] = bootSector[index];
            index++;
        }
        System.out.println("Read data: ");
        for (char c : arr) {
            System.out.print(c+", ");
        }
        System.out.println();
        return arr;
    }
}
