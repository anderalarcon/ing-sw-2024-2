package Semana4.Ejercicio2.Antes;

public class Main {

    public static void main(String[] args) {
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();

        double monto = 100.0;

        System.out.println("Impuesto en USA: " + calculadora.calcularImpuesto(monto, "USA"));
        System.out.println("Impuesto en UK: " + calculadora.calcularImpuesto(monto, "UK"));
        System.out.println("Impuesto en Alemania: " + calculadora.calcularImpuesto(monto, "Germany"));
    }
}
