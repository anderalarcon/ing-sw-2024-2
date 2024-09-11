package Semana3.Ejercicio1.Despues;

public class TiendaElectronica extends Tienda {

    @Override
    public Producto crearProducto(String nombre, double precio, double costoEnvio) {
        System.out.println("Creando producto electronico: " + nombre);
        return new ProductoElectronico(nombre, precio, costoEnvio);
    }

}
