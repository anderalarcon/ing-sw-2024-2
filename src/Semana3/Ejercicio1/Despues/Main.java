package Semana3.Ejercicio1.Despues;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de la tienda
        Tienda tienda = new Tienda();

        // Crear productos utilizando la tienda
        Producto productoElectronico = tienda.crearProducto("electronico");
        Producto productoRopa = tienda.crearProducto("ropa");

        // Mostrar detalles de los productos
        System.out.println("Producto electrónico:");
        productoElectronico.mostrarDatos();
        System.out.println();

        System.out.println("Producto de ropa:");
        productoRopa.mostrarDatos();
        System.out.println();
    }
}
