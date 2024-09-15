package Semana4.Ejercicio1.Antes;

public class PagoStripe {
    // Stripe solo acepta pagos en dólares

    public void pay(double amount) {
        System.out.println("Pago realizado con Stripe: $" + amount + " USD");
    }
}
