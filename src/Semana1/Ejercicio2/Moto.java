package Semana1.Ejercicio2;

public class Moto extends Vehiculo {

    private String tipo;

    public Moto(String tipo, String marca, String modelo, String año) {
        super(marca, modelo, año);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El tipo es :" + tipo);
    }

}
