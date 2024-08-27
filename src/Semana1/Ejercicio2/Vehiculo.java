package Semana1.Ejercicio2;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String año;

    public Vehiculo(String marca, String modelo, String año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarDatos() {
        System.out.println("La marca es:" + marca);
        System.out.println("El modelo es:" + modelo);
        System.out.println("El año es :" + año);

    }

}
