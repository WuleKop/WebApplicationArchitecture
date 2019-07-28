/**
 * 
 */
package edu.mum.cs544.domain;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
    @Min(value = 100, message = "{ThreeDigit.validation}") @Max(value = 999, message = "{ThreeDigit.validation}")
 	private Integer area;
	@NotNull
	@Min(value = 100, message = "{ThreeDigit.validation}") @Max(value = 999, message = "{ThreeDigit.validation}")
 	private Integer prefix;
	@NotNull
	@Min(value = 1000, message = "{FourDigit.Validation}") @Max(value = 9999, message = "{FourDigit.Validation}")
 	private Integer number;
	

 
	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}
}
