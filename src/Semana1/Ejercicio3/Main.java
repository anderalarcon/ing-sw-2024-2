package Semana1.Ejercicio3;

public class Main {

    public static void main(String[] args) {
        try {
            Rectangulo r1 = new Rectangulo(2,2 );
            System.out.println("El area del rectangulo es :" + r1.calcularArea());

            Circulo c1 = new Circulo(4);
            System.out.println("El area del ciruclo es :" + c1.calcularArea());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
