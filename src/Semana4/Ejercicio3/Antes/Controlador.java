package Semana4.Ejercicio3.Antes;

public class Controlador {

    private Personaje personaje;

    public Controlador(Personaje personaje) {
        this.personaje = personaje;
    }

    public void presionarBoton(String boton) {
        switch (boton) {
            case "arriba":
                personaje.moverArriba();
                break;
            case "abajo":
                personaje.moverAbajo();
                break;
            default:
                System.out.println("Botón no reconocido.");
        }
    }
}
