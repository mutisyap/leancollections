package ke.natujenge.java.generics.restricted;

public class MessageTest {
    public static void main(String[] args) {
        MessageSender<EmailMessage> emailMessageMessageSender = new MessageSender<>();
        EmailMessage emailMessage = new EmailMessage("pmutisya@meliora.tech",
                "info@natujenge.ke", "Hello", "Hello all");
        emailMessageMessageSender.sendMessage(emailMessage);

        MessageSender<SMSMessage> smsMessageMessageSender = new MessageSender<>();
    }
}
