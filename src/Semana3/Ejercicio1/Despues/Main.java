
package Semana3.Ejercicio1.Despues;

public class Main {
    public static void main(String[] args) {
            TiendaElectronica te = new TiendaElectronica();
            te.crearProducto();
            te.mostrarProducto();
            System.out.println("#################");
            TiendaRopa tr = new TiendaRopa();
            tr.crearProducto();
            tr.mostrarProducto();
    }
}
