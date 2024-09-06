 
package Semana2.Ejercicio2.Antes;

public class GestorDeMensajesV1 {

    public void enviarMensaje(String tipo, String contenido) {
        if (tipo.equalsIgnoreCase("correo")) {
            enviarCorreo(contenido);
        } else if (tipo.equalsIgnoreCase("sms")) {
            enviarSMS(contenido);
        }
    }

    private void enviarCorreo(String contenido) {
        System.out.println("Enviando correo V1: " + contenido);
    }

    private void enviarSMS(String contenido) {
        System.out.println("Enviando SMS V1: " + contenido);
    }
}
