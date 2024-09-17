package Semana5.Ejercicio2.Despues;

public class Tienda {
    // Método para aplicar el descuento basado en un tipo específico

    public double aplicarDescuento(double precio, String tipoDescuento) {
        switch (tipoDescuento) {
            case "Navidad":
                return aplicarDescuentoNavidad(precio);
            case "BlackFriday":
                return aplicarDescuentoBlackFriday(precio);
            case "VIP":
                return aplicarDescuentoVIP(precio);
            default:
                throw new IllegalArgumentException("Tipo de descuento no soportado");
        }
    }

    // Métodos privados para cada tipo de descuento
    private double aplicarDescuentoNavidad(double precio) {
        // Descuento del 10% para Navidad
        return precio - (precio * 0.10); // Retorna el precio con el descuento aplicado
    }

    private double aplicarDescuentoBlackFriday(double precio) {
        // Descuento del 20% para Black Friday
        return precio - (precio * 0.20); // Retorna el precio con el descuento aplicado
    }

    private double aplicarDescuentoVIP(double precio) {
        // Descuento del 15% para clientes VIP
        return precio - (precio * 0.15); // Retorna el precio con el descuento aplicado
    }
}
