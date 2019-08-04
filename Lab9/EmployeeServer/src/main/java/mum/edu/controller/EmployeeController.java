package mum.edu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mum.edu.domain.Employee;
import mum.edu.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "Employee Controller", description = "A controller to add, delete and update Employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @CrossOrigin(origins = {"http://localhost:9999"}, maxAge = 5000)
    @ApiOperation(value="Add Employee", notes = "${EmployeeController.addEmployee.notes}")
    @PostMapping("/employee")
    public Employee addEmployee(@Valid @RequestBody Employee employee) {
        System.out.println(employee);
        employeeRepository.addEmployee(employee);
        return employee;
    }
    @ApiOperation(value="Get All Employees", notes = "${EmployeeController.getAllEmployees.notes}")
    @GetMapping("/employeeList")
//   Spring HATEOAS with collection
//    public Resources<Employee> getAllEmployees() {
//       List<Employee> employeeList= employeeRepository.getAllEmployee();
//       Resources<Employee> resource = new Resources<>(employeeList);
//           ControllerLinkBuilder link1 = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getEmployeeByFirstName("firstName"));
//           ControllerLinkBuilder link2 = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).addEmployee(employeeList.get(0)));
//           ControllerLinkBuilder link3 = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getAllEmployees());
//           resource.add(link3.withSelfRel().withType("GET"));
//           resource.add(link2.withRel("Add New Employee").withType("POST"));
//           resource.add(link1.withRel("Get All Employee List").withType("GET"));
//
//       return resource;
//    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployee();
    }
    @ApiOperation(value="Get Employee By First Name", notes = "${EmployeeController.getEmployeeByFirstName.notes}")
    @GetMapping("/employee/{firstName}")
    public Resource<Employee> getEmployeeByFirstName(@PathVariable String firstName){
        Employee emp = employeeRepository.getEmployeeByFirstName(firstName);

        Resource<Employee> resource=new Resource<>(emp);
        ControllerLinkBuilder link1 = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getEmployeeByFirstName(firstName));
        ControllerLinkBuilder link2 = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).addEmployee(emp));
        ControllerLinkBuilder link3 = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getAllEmployees());

        resource.add(link1.withSelfRel().withType("GET"));
        resource.add(link2.withRel("Add New Employee").withType("POST"));
        resource.add(link3.withRel("Get All Employee List").withType("GET"));
        return resource;
    }

	
}
