
package Semana11.Ejercicio3.Despues;

public class Main {

    public static void main(String[] args) {
        NotificationSystem system = new NotificationSystem();
        system.sendNotification("email", "ander@gmail.com", "Bienvenido!");
        system.sendNotification("sms", "1234567890", "Test sms 54321");
        system.sendNotification("push", "user123", "Nuevo push noti");
    }
}
