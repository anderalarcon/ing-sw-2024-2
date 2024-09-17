package Semana5.Ejercicio2.Antes;

public class Main {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        double precio = 100.0;

        // Aplicar descuento de Navidad
        double descuentoNavidad = tienda.aplicarDescuento(precio, "Navidad");
        System.out.println("Descuento NAVIDAD: $" + descuentoNavidad);

        // Aplicar descuento de Black Friday
        double descuentoBlackFriday = tienda.aplicarDescuento(precio, "BlackFriday");
        System.out.println("Descuento BLACKFRIDAY: $" + descuentoBlackFriday);

        // Aplicar descuento VIP
        double descuentoVIP = tienda.aplicarDescuento(precio, "VIP");
        System.out.println("Descuento VIP: $" + descuentoVIP);
    }
}
