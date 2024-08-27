package Semana1.Ejercicio3;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() throws Exception {
        if (radio < 0) {
            throw new Exception("El radio debe ser positivo");
        }
        return Math.PI * radio * radio;
    }

}
