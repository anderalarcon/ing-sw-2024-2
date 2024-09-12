package Semana4.Ejercicio3.Despues;

public class MoverArribaComando implements Comando {

    private Personaje personaje;

    public MoverArribaComando(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void ejecutar() {
        personaje.moverArriba();
    }

}
