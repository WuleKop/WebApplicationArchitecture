package mum.edu.domain;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

public class Employee {


	@ApiModelProperty(notes = "The employee first name")
	@NotEmpty(message = "{Employee.validation.notEmpty}")
 	private String firstName;
	@ApiModelProperty(notes = "The employee last name")
	@NotEmpty(message = "{Employee.validation.notEmpty}")
	@Size(min=3, max = 10, message = "{Employee.validation.size}")
 	private String lastName;
	@ApiModelProperty(notes = "The employee email")
	@NotEmpty(message = "{Employee.validation.notEmpty}")
 	private String email;
	public Employee(){ }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
