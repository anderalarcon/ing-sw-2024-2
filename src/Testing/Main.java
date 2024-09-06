package Testing;

public class Main {

    public static void main(String[] args) {
        TiendaElectronica te = new TiendaElectronica();
        te.crearProducto("Celular", 500, 50);

        TiendaRopa tr = new TiendaRopa();

        tr.crearProducto("Polo", 500, 100);

    }
}
