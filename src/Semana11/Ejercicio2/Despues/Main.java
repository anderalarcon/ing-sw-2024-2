package Semana11.Ejercicio2.Despues;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmployeeStorage storage = new InMemoryEmployeeStorage();
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem system = new EmployeeManagementSystem(storage, scanner);

        system.run();
    }
}
