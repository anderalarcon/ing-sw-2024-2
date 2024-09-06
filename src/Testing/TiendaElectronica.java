package Testing;

public class TiendaElectronica extends Tienda {

    @Override
    public Producto crearProducto(String nombre, double precio, double costoEnvio) {
        System.out.println("Creando producto electronico" + nombre + precio + costoEnvio);
        return new ProductoElectronico(nombre, precio, costoEnvio);
    }

}
