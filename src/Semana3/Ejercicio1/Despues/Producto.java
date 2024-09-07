package Semana3.Ejercicio1.Despues;

public class Producto {

    private String nombre;
    private double precio;
    private double costoEnvio;

    public Producto(String nombre, double precio, double costoEnvio) {
        this.nombre = nombre;
        this.precio = precio;
        this.costoEnvio = costoEnvio;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Costo de envío: $" + costoEnvio);
    }

}
