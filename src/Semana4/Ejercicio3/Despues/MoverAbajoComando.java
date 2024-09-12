package Semana4.Ejercicio3.Despues;

public class MoverAbajoComando implements Comando {

    private Personaje personaje;

    public MoverAbajoComando(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void ejecutar() {
        personaje.moverAbajo();
    }

}
