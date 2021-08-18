package ke.natujenge.java.generics.pcm;

import java.util.Queue;

public class Consumer<T> {
    private Queue<T> queue;

    public Consumer(Queue<T> queue) {
        this.queue = queue;
    }

    public T consume(){
        return this.queue.poll();
    }
}
