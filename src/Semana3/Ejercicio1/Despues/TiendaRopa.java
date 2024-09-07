package Semana3.Ejercicio1.Despues;

public class TiendaRopa extends Tienda {

    @Override
    public Producto crearProducto(String nombre, double precio, double costoEnvio) {
        System.out.println("Creando producto ropa: " + nombre);

        return new ProductoRopa(nombre, precio, costoEnvio);
    }

}
