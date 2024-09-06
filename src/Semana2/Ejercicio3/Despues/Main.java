package Semana2.Ejercicio3.Despues;

public class Main {

    public static void main(String[] args) {
        Trabajador humano = new HumanoV1();
        humano.trabajar();
        humano.comer();
        humano.descansar();
        humano.reunirse();

        Trabajador robot = new RobotV1();
        robot.trabajar();
        robot.comer(); // Esto lanzará una excepción, ya que los robots no pueden comer
    }
}
