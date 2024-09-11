package Semana2.Ejercicio2.Despues;

public class Sms implements CanalDeComunicacion{
    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Enviando SMS V1: " + contenido);
    }
}
