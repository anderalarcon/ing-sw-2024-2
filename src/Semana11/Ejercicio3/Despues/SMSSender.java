
package Semana11.Ejercicio3.Despues;

public class SMSSender implements NotificationSender {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Enviando SMS a " + recipient + ": " + message);
    }
}