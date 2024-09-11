package Semana2.Ejercicio2.Despues;

public class Main {

    public static void main(String[] args) {

        Sms s1 = new Sms();
        Correo c1 = new Correo();
        GestorDeMensajesV2 g2 = new GestorDeMensajesV2();
        g2.enviarMensaje(s1, "envia mensaje sms");
        g2.enviarMensaje(c1, "envia mensaje correo");

    }
}
