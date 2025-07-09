package tobyspring.splearn.application.required;

/**
 * 이매일을 발송한다.
 */
public interface EmailSender {
    void send(String to, String subject, String body);
}
