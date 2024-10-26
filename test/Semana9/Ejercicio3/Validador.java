
package Semana9.Ejercicio3;

public class Validador {

    public boolean validarCorreoElectronico(String correo) {
        return correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    public boolean validarNumeroTelefono(String numero) {
        return numero.matches("\\d{9}");
    }

}
