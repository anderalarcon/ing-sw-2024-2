
package Semana4.Ejercicio2.Despues;

public class ImpuestoUSA implements EstrategiaImpuesto {

    @Override
    public double calcular(double monto) {
        return monto * 0.07;
    }

}
