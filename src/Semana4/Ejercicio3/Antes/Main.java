package Semana4.Ejercicio3.Antes;

public class Main {

    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        Controlador controlador = new Controlador(personaje);

        controlador.presionarBoton("arriba");
        controlador.presionarBoton("abajo");
    }
}
