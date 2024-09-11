package Semana2.Ejercicio2.Despues;

public class Correo implements CanalDeComunicacion {

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Enviando correo V1: " + contenido);
    }
}
