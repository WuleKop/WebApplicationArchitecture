package mum.edu.validation;

 	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	import java.util.ArrayList;
	import java.util.List;
	 @Data
	 @NoArgsConstructor
	 @AllArgsConstructor
	public class DomainErrors {
	 
	    private String errorType;
	    private String message;
		private List<DomainError> errors = new ArrayList<>();

		public void addDomainError(DomainError domainError) {
			errors.add(domainError);
		}

	 
 	}
	
 
