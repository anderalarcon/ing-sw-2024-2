package Semana5.Ejercicio2.Despues;

public class DescuentoNavidad implements EstrategiaDescuento {

    @Override
    public double calcular(double precio) {
        return precio - (precio * 0.10); // Retorna el precio con el descuento aplicado
    }
}
