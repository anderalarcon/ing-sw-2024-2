package Semana4.Ejercicio2.Despues;

public class ImpuestoAlemania implements EstrategiaImpuesto {

    @Override
    public double calcular(double monto) {
        return monto * 0.19;
    }

}
