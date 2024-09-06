package Semana3.Ejercicio1.Despues;

public abstract class Tienda {

    public abstract Producto crearProducto();

    public void mostrarProducto() {
        Producto producto = crearProducto(); // Crear producto usando el método de fábrica
        producto.mostrarDatos(); // Mostrar los datos del producto
    }
}
