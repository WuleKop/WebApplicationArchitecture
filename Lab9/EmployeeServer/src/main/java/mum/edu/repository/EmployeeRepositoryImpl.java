package mum.edu.repository;

import mum.edu.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private List<Employee> employeeList=new ArrayList<>();
    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    @Override
    public List<Employee> getAllEmployee() {
        return employeeList;
    }
    @Override
    public Employee getEmployeeByFirstName(String firstName) {
        Employee emp = new Employee();
        for(Employee e:employeeList) {
            if(e.getFirstName().equals(firstName)) {
                emp=e;
            }
        }
        return emp;
    }
}
