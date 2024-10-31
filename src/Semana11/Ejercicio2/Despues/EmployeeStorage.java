package Semana11.Ejercicio2.Despues;

import java.util.List;

public interface EmployeeStorage {

    void addEmployee(Employee employee);

    List<Employee> getEmployees();
}
