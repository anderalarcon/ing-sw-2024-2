package Semana2.Ejercicio3.Despues;


public class HumanoV2 implements TrabajadorHumano {

    @Override
    public void trabajar() {
        System.out.println("Trabajando...");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo...");
    }

    @Override
    public void descansar() {
        System.out.println("Descansando...");
    }

    @Override
    public void reunirse() {
        System.out.println("Reunión...");
    }
}
