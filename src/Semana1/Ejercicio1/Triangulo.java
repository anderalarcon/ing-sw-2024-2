package Semana1.Ejercicio1;

public class Triangulo {

    private int base;
    private double altura;

    public Triangulo(int base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarDatos() {
        System.out.println("La base es " + base);
        System.out.println("La altura es " + altura);
    }

    public double calcularArea() {
        return base * altura;
    }
}
