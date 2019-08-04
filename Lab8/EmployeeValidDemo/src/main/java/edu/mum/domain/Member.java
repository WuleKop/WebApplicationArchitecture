package edu.mum.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {

    @NotEmpty
	@Size(min = 2, max=50)
	private String firstName;

	private String lastName;
	@NotNull
	@Min(18)
	private Integer age;
	private Integer memberNumber;
}
