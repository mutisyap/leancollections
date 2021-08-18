package ke.natujenge.java.generics.restricted;

public class EmailMessage extends Message {

    private String sourceAddress;

    private String destinationAddress;

    private String subject;

    private String message;

    public EmailMessage(String sourceAddress, String destinationAddress, String subject, String message) {
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.subject = subject;
        this.message = message;
        this.channel = MessageChannel.EMAIL;
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "sourceAddress='" + sourceAddress + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
