package Semana11.Ejercicio2.Despues;

import java.util.Scanner;

public class ExitCommand implements Command {

    private final Scanner scanner;

    public ExitCommand(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Saliendo...");
        scanner.close();
    }
}
