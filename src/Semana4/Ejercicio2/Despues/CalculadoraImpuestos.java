package Semana4.Ejercicio2.Despues;

public class CalculadoraImpuestos {

    private EstrategiaImpuesto estrategia;

    public CalculadoraImpuestos(EstrategiaImpuesto estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularImpuesto(double monto) {
        return estrategia.calcular(monto);
    }

}
