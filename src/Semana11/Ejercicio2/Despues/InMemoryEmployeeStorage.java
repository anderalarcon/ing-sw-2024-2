
package Semana11.Ejercicio2.Despues;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEmployeeStorage implements EmployeeStorage {

    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}
