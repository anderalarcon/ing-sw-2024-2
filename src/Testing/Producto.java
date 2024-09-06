package Testing;

public abstract class Producto {

    private String nombre;
    private double precio;
    private double costoEnvio;

    public Producto(String nombre, double precio, double costoEnvio) {
        this.nombre = nombre;
        this.precio = precio;
        this.costoEnvio = costoEnvio;
    }

}
