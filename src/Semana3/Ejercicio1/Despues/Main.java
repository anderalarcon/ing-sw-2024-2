package Semana3.Ejercicio1.Despues;

public class Main {

    public static void main(String[] args) {
        TiendaElectronica te = new TiendaElectronica();
        te.crearProducto("Celular android", 5000, 20);
        System.out.println("#################");
        TiendaRopa tr = new TiendaRopa();
        tr.crearProducto("polo zara", 200, 50);
    }
}
