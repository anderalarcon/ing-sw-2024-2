package Semana5.Ejercicio2.Despues;

public class Tienda {

    private EstrategiaDescuento estrategiaDescuento;

    public void setEstrategiaDescuento(EstrategiaDescuento estrategiaDescuento) {
        this.estrategiaDescuento = estrategiaDescuento;
    }

    public double aplicarDescuento(double precio) {
        return estrategiaDescuento.calcular(precio); // Calcula el precio con descuento aplicado
    }
}
