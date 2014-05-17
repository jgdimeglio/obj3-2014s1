package aspects;

import interfaces.Validator;
import annotations.Observable;

@Observable
public class Example {

	int name;

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
	
	
//	public class ValidatoString implements Validator<String>{
//
//		@Override
//		public void validate(String value) {
//			System.out.println("validando"+value);
//		}
//		
//	}
	
	public static void main(String[] args) {
		Example e=new Example();
		
		
		e.addValidator("name", new Validator<Integer>() {

			@Override
			public boolean validate(Integer value) {
				return true;
			}
		});
		
		e.setName(3);
		
		e.setName(4);
		
	}
	
	

	
}
