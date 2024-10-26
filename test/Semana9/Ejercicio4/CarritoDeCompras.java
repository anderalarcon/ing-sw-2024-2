
package Semana9.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(producto -> producto.getNombre().equals(nombre));
    }

    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(producto -> producto.getPrecio() * producto.getCantidad())
                .sum();
    }

    public boolean contieneProducto(String nombre) {
        return productos.stream()
                .anyMatch(producto -> producto.getNombre().equals(nombre));
    }
}