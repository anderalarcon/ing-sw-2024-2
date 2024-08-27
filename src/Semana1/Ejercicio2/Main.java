package Semana1.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Auto a1 = new Auto(2, "toyota", "yaris", "2024");
        Moto m1 = new Moto("pistera", "Suzuki", "Deportiva", "2024");
        
        a1.mostrarDatos();
        System.out.println("--------------------------------");
        m1.mostrarDatos();
        
    }

}
