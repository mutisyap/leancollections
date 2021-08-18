package ke.natujenge.java.generics.restricted;

public class SMSMessage extends Message{

    private String sourceAddress;

    private String destinationAddress;

    private String message;

    public SMSMessage(String sourceAddress, String destinationAddress, String message) {
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.message = message;
        this.channel = MessageChannel.SMS;
    }

    @Override
    public String toString() {
        return "SMSMessage{" +
                "sourceAddress='" + sourceAddress + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
