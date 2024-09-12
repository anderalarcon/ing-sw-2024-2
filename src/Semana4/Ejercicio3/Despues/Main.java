package Semana4.Ejercicio3.Despues;

public class Main {

    public static void main(String[] args) {
        Personaje personaje = new Personaje();

        Comando moverArriba = new MoverArribaComando(personaje);
        Comando moverAbajo = new MoverAbajoComando(personaje);

        Controlador controlador = new Controlador();

        controlador.asignarComando("arriba", moverArriba);
        controlador.presionarBoton("arriba");

        controlador.asignarComando("abajo", moverAbajo);
        controlador.presionarBoton("abajo");

    }
}
