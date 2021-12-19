package Memento;



import java.util.Random;


public class Guesser implements Runnable {
    private Object obj;
    private Random rand;
    private Riddler master;

    public Guesser() { rand = new Random(); }

    public Guesser(Riddler riddler) {
        this.rand = new Random();
        this.master = riddler;
    }

    public void setSecretNumber() {
        if (master == null)
            return;
        this.obj = master.joinTheGame();
        System.out.println(Thread.currentThread().getName()+" has joined the game");
    }

    public void setRiddler(Riddler riddler) {
        this.master = riddler;
    }

    public boolean quessedCorrectly() {
        int quess = rand.nextInt(10);
        System.out.println(Thread.currentThread().getName()+ " quesses "+ quess);
        return master.quess(this.obj, quess);
    }

    @Override
    public void run() {
        setSecretNumber();
        while (!quessedCorrectly()) {
            try {
                Thread.sleep(100+rand.nextInt(300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("### "+Thread.currentThread().getName()+" quessed correctly ###");

    }
}

