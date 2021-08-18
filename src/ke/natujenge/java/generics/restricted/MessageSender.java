package ke.natujenge.java.generics.restricted;

public class MessageSender<T extends Message> {
    public void sendMessage(T t){
        System.out.println("Successfully sent message : "+ t);
    }
}
