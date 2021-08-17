package ke.natujenge.java.collections.learnqueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> students = new LinkedList<>();
        Queue<String> studentsPriority = new PriorityQueue<>();
        Queue<String> doubleEnded = new ArrayDeque<>();
    }
}
