package Semana4.Ejercicio1.Despues;

public class Main {

    public static void main(String[] args) {
        // Pago utilizando PayPal
        ProveedorPago pagoPaypal = new PagoPaypal();
        pagoPaypal.procesarPago(100, "USD");

        // Pago utilizando Stripe a través del adaptador
        PagoStripe pagoStripe = new PagoStripe();
        ProveedorPago stripeAdapter = new StripeAdapter(pagoStripe);

        // Usando el adaptador para procesar pagos en otras monedas
        stripeAdapter.procesarPago(85, "EUR"); // El adaptador convierte EUR a USD
    }
}
