package ke.natujenge.java.generics.pcm;

import ke.natujenge.java.generics.restricted.SMSMessage;

import java.util.LinkedList;
import java.util.Queue;

public class PCMExample {
    public static void main(String[] args) {

        // string example
        Queue<String> queue = new LinkedList<>();

        Producer<String> stringProducer = new Producer<>(queue);

        Consumer<String> stringConsumer = new Consumer<>(queue);

        stringProducer.addToQueue("Peter Mutisya");

        System.out.println("Consumed : "+ stringConsumer.consume());

        // SMSMessage Example
        Queue<SMSMessage> messageQueue = new LinkedList<>();
        Producer<SMSMessage> smsMessageProducer = new Producer<>(messageQueue);
        Consumer<SMSMessage> smsMessageConsumer = new Consumer<>(messageQueue);

        SMSMessage smsMessage = new SMSMessage("M-PESA", "0719547942", "You have received 1 bob from Equity");

        smsMessageProducer.addToQueue(smsMessage);
        System.out.println("Consumed : "+ smsMessageConsumer.consume());

    }
}
