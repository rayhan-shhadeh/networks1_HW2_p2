package package2;

public class Receive implements Runnable {
    Client c;

    Receive(Client aThis) {
        c = aThis;
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            c.receive();
        }
    }
}
