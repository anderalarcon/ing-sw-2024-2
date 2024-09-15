package Semana4.Ejercicio1.Antes;

public class Main {

    public static void main(String[] args) {
        // Pago utilizando PayPal
        PagoPaypal pagoPaypal = new PagoPaypal();
        pagoPaypal.realizarPago(100, "USD");

        // Intentando realizar un pago utilizando Stripe
        PagoStripe pagoStripe = new PagoStripe();

        // Stripe solo acepta pagos en USD, entonces se debe convertir la moneda si no es USD
        String moneda = "EUR";
        double monto = 85;

        if (!moneda.equalsIgnoreCase("USD")) {
            System.out.println("Convirtiendo " + monto + " " + moneda + " a USD para Stripe.");
            // Convirtiendo de EUR a USD, ya que Stripe solo acepta USD
            monto = convertirAUSD(monto, moneda); // Método para la conversión a USD
        }

        pagoStripe.pay(monto); // Realiza el pago con Stripe, ahora en USD
    }

    // Método ficticio para la conversión de otras monedas a USD
    private static double convertirAUSD(double monto, String moneda) {
        // Implementación simplificada para la conversión de EUR a USD
        if (moneda.equalsIgnoreCase("EUR")) {
            return monto * 1.10; // Supongamos que 1 EUR = 1.10 USD
        }
        // Agregar otras conversiones según sea necesario
        return monto;
    }
}
