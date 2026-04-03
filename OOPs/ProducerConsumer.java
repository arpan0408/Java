import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int val) throws InterruptedException {
        while (queue.size() == CAPACITY) wait();
        queue.add(val);
        System.out.println("Produced: " + val);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) wait();
        int val = queue.poll();
        System.out.println("Consumed: " + val);
        notify();
    }
}

class Producer implements Runnable {
    private Buffer buffer;
    Producer(Buffer b) { buffer = b; }
    public void run() {
        int i = 1;
        try { while (true) { buffer.produce(i++); Thread.sleep(500); } }
        catch (InterruptedException e) {}
    }
}

class Consumer implements Runnable {
    private Buffer buffer;
    Consumer(Buffer b) { buffer = b; }
    public void run() {
        try { while (true) { buffer.consume(); Thread.sleep(1000); } }
        catch (InterruptedException e) {}
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Thread(new Producer(buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}
