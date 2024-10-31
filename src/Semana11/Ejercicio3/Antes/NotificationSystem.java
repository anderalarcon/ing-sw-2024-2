package Semana11.Ejercicio3.Antes;

public class NotificationSystem {

    public void sendNotification(String type, String recipient, String message) {
        if (type.equals("email")) {
            sendEmail(recipient, message);
        } else if (type.equals("sms")) {
            sendSMS(recipient, message);
        } else if (type.equals("push")) {
            sendPushNotification(recipient, message);
        } else {
            System.out.println("No soportado");
        }
    }

    private void sendEmail(String recipient, String message) {
        System.out.println("Enviando email a " + recipient + ": " + message);
    }

    private void sendSMS(String recipient, String message) {
        System.out.println("Enviando SMS a " + recipient + ": " + message);
    }

    private void sendPushNotification(String recipient, String message) {
        System.out.println("Enviando push notification a " + recipient + ": " + message);
    }

    public static void main(String[] args) {
        NotificationSystem system = new NotificationSystem();

        system.sendNotification("email", "ander@gmail.com", "Bienvenido!");
        system.sendNotification("sms", "1234567890", "Test sms 54321");
        system.sendNotification("push", "user123", "Nuevo push noti");
    }
}
