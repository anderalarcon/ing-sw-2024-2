package Semana1.Ejercicio2;

public class Auto extends Vehiculo {

    private int puertas;

    public Auto(int puertas, String marca, String modelo, String año) {
        super(marca, modelo, año);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El numero de puertas es :" + puertas);
    }

}
