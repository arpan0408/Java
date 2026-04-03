class ThreadDemo implements Runnable {
    public void run() {
        try {

            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()+" point: "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Delay {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadDemo());
        Thread t2 = new Thread(new ThreadDemo());
        Thread t3 = new Thread(new ThreadDemo());
        t1.start();
        t2.start();
        t3.start();
    }
}
