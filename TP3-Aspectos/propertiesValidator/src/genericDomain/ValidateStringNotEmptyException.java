package genericDomain;

import interfaces.Validator;

public class ValidateStringNotEmptyException implements Validator<String> {
   
	@Override
	public boolean validate(String value) {
		// TODO Auto-generated method stub
		return value.length() > 0;
	}
}
