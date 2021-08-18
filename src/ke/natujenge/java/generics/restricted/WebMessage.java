package ke.natujenge.java.generics.restricted;

public class WebMessage extends Message {
    private String message;

    public WebMessage(String message) {
        this.message = message;
        this.channel = MessageChannel.WEB;
    }

    @Override
    public String toString() {
        return "WebMessage{" +
                "message='" + message + '\'' +
                ", channel=" + channel +
                "} " + super.toString();
    }
}
