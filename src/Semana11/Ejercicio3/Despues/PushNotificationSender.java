
package Semana11.Ejercicio3.Despues;

public class PushNotificationSender implements NotificationSender {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Enviando push notification a " + recipient + ": " + message);
    }
}