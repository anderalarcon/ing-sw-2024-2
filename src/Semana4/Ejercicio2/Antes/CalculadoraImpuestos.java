package Semana4.Ejercicio2.Antes;

public class CalculadoraImpuestos {

    public double calcularImpuesto(double monto, String pais) {
        if (pais.equalsIgnoreCase("USA")) {
            return calcularImpuestoUSA(monto);
        } else if (pais.equalsIgnoreCase("UK")) {
            return calcularImpuestoUK(monto);
        } else if (pais.equalsIgnoreCase("Germany")) {
            return calcularImpuestoGermany(monto);
        } else {
            return 0; // No hay impuesto
        }
    }

    private double calcularImpuestoUSA(double monto) {
        return monto * 0.07; // 7% de impuesto en USA
    }

    private double calcularImpuestoUK(double monto) {
        return monto * 0.2; // 20% de impuesto en UK
    }

    private double calcularImpuestoGermany(double monto) {
        return monto * 0.19; // 19% de impuesto en Alemania
    }
}
