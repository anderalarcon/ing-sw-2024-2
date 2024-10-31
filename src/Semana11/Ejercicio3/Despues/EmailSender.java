
package Semana11.Ejercicio3.Despues;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Enviando email a  " + recipient + ": " + message);
    }
}