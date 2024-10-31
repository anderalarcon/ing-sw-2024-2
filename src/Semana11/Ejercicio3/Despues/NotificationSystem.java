
package Semana11.Ejercicio3.Despues;

public class NotificationSystem {

    public void sendNotification(String type, String recipient, String message) {
        NotificationSender sender = NotificationSenderFactory.getSender(type);
        sender.send(recipient, message);
    }
}
