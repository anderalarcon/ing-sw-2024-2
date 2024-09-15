package Semana4.Ejercicio2.Despues;

public class Main {

    public static void main(String[] args) {
        EstrategiaImpuesto impuestoUSA = new ImpuestoUSA();

        CalculadoraImpuestos calculadoraUSA = new CalculadoraImpuestos(impuestoUSA);
        System.out.println("Calculando impuesto en USA:" + calculadoraUSA.calcularImpuesto(100));

        System.out.println("#################################################");

        EstrategiaImpuesto impuestoUK = new ImpuestoUK();

        CalculadoraImpuestos calculadoraUK = new CalculadoraImpuestos(impuestoUK);
        System.out.println("Calculando impuesto en UK:" + calculadoraUK.calcularImpuesto(100));
    }

}
