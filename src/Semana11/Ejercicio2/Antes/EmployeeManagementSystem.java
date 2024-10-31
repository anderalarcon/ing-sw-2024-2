
package Semana11.Ejercicio2.Antes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementSystem {

    private List<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
             System.out.println("Employee Management System");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Salir");
            System.out.print("Escoge una opcion: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    listEmployees();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                System.out.println("Opcion invalida");
            }
        }
    }

    private void addEmployee(Scanner scanner) {
        System.out.print("Ingresa nombre del empleado: ");
        String name = scanner.nextLine();
        System.out.print("Ingresa edad del empleado: ");
        int age = scanner.nextInt();
        employees.add(new Employee(name, age));
        System.out.println("Empleado agregado.");
    }

    private void listEmployees() {
        System.out.println("Lista de empleados:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.run();
    }
}
