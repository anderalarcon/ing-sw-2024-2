package Semana11.Ejercicio2.Despues;

public class ListEmployeesCommand implements Command {

    private final EmployeeStorage storage;

    public ListEmployeesCommand(EmployeeStorage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        System.out.println("Lista de empleados:");
        for (Employee employee : storage.getEmployees()) {
            System.out.println(employee);
        }
    }
}
