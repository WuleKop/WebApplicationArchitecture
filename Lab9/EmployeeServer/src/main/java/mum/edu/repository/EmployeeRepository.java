package mum.edu.repository;

import mum.edu.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeByFirstName(String firstName);
}
