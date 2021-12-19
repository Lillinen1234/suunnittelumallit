package Command;

public class Screen {
    Thread t;
    Boolean down = false;

    public void screenDown() {
        if (down && t.isAlive()) {
            System.out.println("Screen is already going down");
            return;
        }
        if (down) {
            System.out.println("Screen is already down");
            return;
        }
        if (t != null && t.isAlive())
            t.interrupt();
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Screen going down...");
                try {
                    Thread.sleep(3000);
                    System.out.println("Screen down");
                } catch (InterruptedException e) {
                }

            }
        });
        t.start();
        down = true;
    }

    public void screenUp() {
        if (!down && t != null && t.isAlive()) {
            System.out.println("Screen is already going up");
            return;
        }
        if (!down) {
            System.out.println("Screen is already up");
            return;
        }
        if (t != null && t.isAlive())
            t.interrupt();
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Screen going up...");
                try {
                    Thread.sleep(3000);
                    System.out.println("Screen up");
                } catch (InterruptedException e) {
                }

            }
        });
        t.start();
        down = false;
    }

}
