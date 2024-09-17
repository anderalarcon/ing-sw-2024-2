package Semana5.Ejercicio2.Despues;

public class DescuentoVIP implements EstrategiaDescuento {

    @Override
    public double calcular(double precio) {
        return precio - (precio * 0.15); // Retorna el precio con el descuento aplicado
    }
}
