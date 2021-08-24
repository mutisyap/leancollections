package ke.natujenge.java.generics.pcm;

import java.util.LinkedList;
import java.util.Queue;

public class Producer<J> {
    private Queue<J> queue;

    public Producer(Queue<J> queue) {
        this.queue = queue;
    }

    public void addToQueue(J j){
        this.queue.add(j);
        System.out.println("Added "+ j + " to queue");
    }
}
