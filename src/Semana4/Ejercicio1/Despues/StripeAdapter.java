package Semana4.Ejercicio1.Despues;

public class StripeAdapter implements ProveedorPago {

    private PagoStripe stripe;

    public StripeAdapter(PagoStripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void procesarPago(double monto, String moneda) {
        if (!moneda.equalsIgnoreCase("USD")) {
            System.out.println("Convirtiendo " + monto + " " + moneda + " a USD para Stripe.");
            // Convirtiendo de EUR a USD, ya que Stripe solo acepta USD
            monto = convertirAUSD(monto, moneda); // Método para la conversión a USD
        }
        stripe.pay(monto);
    }

    private double convertirAUSD(double monto, String moneda) {
        if (moneda.equalsIgnoreCase("EUR")) {
            return monto * 1.10;
        }
        return monto;
    }

}
