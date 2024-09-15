package Semana4.Ejercicio1.Despues;

public class PagoPaypal implements ProveedorPago {

    @Override
    public void procesarPago(double monto, String moneda) {
        System.out.println("Pago realizado con PayPal: $" + monto + " " + moneda);
    }

}
