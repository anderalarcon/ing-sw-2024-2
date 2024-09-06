
package Semana3.Ejercicio1.Despues;

public class TiendaElectronica extends Tienda {
    
    @Override
    public Producto crearProducto(){
        return new ProductoElectronico();
    }
}
