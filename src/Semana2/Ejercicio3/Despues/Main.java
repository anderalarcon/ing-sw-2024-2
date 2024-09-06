package Semana2.Ejercicio3.Despues;

public class Main {

    public static void main(String[] args) {
        TrabajadorHumano humano = new HumanoV2();
        humano.trabajar();
        humano.comer();
        humano.descansar();
        humano.reunirse();

        TrabajadorRobot robot = new RobotV2();
        robot.trabajar();
    }
}
