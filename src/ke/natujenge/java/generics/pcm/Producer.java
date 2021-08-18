package ke.natujenge.java.generics.pcm;

import java.util.LinkedList;
import java.util.Queue;

public class Producer<T> {
    private Queue<T> queue;

    public Producer(Queue<T> queue) {
        this.queue = queue;
    }

    public void addToQueue(T t){
        this.queue.add(t);
        System.out.println("Added "+ t + " to queue");
    }
}
