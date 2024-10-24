package Semana5.Ejercicio2.Despues;

public class DescuentoBlackFriday implements EstrategiaDescuento {

    @Override
    public double calcular(double precio) {
        return precio - (precio * 0.20); // Retorna el precio con el descuento aplicado
    }
}
