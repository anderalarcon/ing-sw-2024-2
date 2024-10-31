package Semana11.Ejercicio2.Despues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementSystem {

    private final Map<Integer, Command> commands = new HashMap<>();
    private final Scanner scanner;

    public EmployeeManagementSystem(EmployeeStorage storage, Scanner scanner) {
        this.scanner = scanner;

        // Inicializamos los comandos disponibles
        commands.put(1, new AddEmployeeCommand(storage, scanner));
        commands.put(2, new ListEmployeesCommand(storage));
        commands.put(3, new ExitCommand(scanner));
    }

    public void run() {
        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Salir");
            System.out.print("Escoge una opcion: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            Command command = commands.get(choice);
            if (command != null) {
                command.execute();
                if (choice == 3) {
                    break; // Salir del bucle al ejecutar ExitCommand
                }
            } else {
                System.out.println("Opcion invalida");
            }
        }
    }
}
