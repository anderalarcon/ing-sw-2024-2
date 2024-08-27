package Semana1.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2,3);
        Triangulo t2 = new Triangulo(2,3);
        
        double t1Area = t1.calcularArea();
        double t2Area = t2.calcularArea();
        
        if (t1Area > t2Area) {
            System.out.println("T1 gana");
            t1.mostrarDatos();
        } else if (t1Area < t2Area) {
            System.out.println("T2 gana");
            t2.mostrarDatos();
        } else {
            System.out.println("Son iguales");
        }
        
    }
}
