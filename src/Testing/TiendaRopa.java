package Testing;

public class TiendaRopa extends Tienda {

    @Override
    public Producto crearProducto(String nombre, double precio, double costoEnvio) {
        System.out.println("Creando producto ropa" + nombre + precio + costoEnvio);
        return new ProductoRopa(nombre, precio, costoEnvio);
    }

}
