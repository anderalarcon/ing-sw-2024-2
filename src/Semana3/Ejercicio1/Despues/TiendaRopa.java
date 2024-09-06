
package Semana3.Ejercicio1.Despues;

public class TiendaRopa extends Tienda{

    @Override
    public Producto crearProducto() {
        return new ProductoRopa();
    }
    
}
