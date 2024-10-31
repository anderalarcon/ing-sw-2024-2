
package Semana11.Ejercicio3.Despues;

public class NotificationSenderFactory {

    public static NotificationSender getSender(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailSender();
            case "sms":
                return new SMSSender();
            case "push":
                return new PushNotificationSender();
            default:
                throw new IllegalArgumentException("No soportado");
        }
    }
}
