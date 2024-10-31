package Semana11.Ejercicio2.Despues;

import java.util.Scanner;

public class AddEmployeeCommand implements Command {

    private final EmployeeStorage storage;
    private final Scanner scanner;

    public AddEmployeeCommand(EmployeeStorage storage, Scanner scanner) {
        this.storage = storage;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Ingresa nombre del empleado: ");
        String name = scanner.nextLine();
        System.out.print("Ingresa edad del empleado: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        storage.addEmployee(new Employee(name, age));
        System.out.println("Empleado agregado.");
    }
}
