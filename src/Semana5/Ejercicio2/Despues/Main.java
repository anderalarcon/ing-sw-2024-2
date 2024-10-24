package Semana5.Ejercicio2.Despues;

public class Main {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        double precioOriginal = 100.0;

        tienda.setEstrategiaDescuento(new DescuentoNavidad());
        System.out.println("Precio con descuento NAVIDAD: $" + tienda.aplicarDescuento(precioOriginal));

        tienda.setEstrategiaDescuento(new DescuentoBlackFriday());
        System.out.println("Precio con descuento BLACKFRIDAY: $" + tienda.aplicarDescuento(precioOriginal));

        tienda.setEstrategiaDescuento(new DescuentoVIP());
        System.out.println("Precio con descuento VIP: $" + tienda.aplicarDescuento(precioOriginal));
    }

}
