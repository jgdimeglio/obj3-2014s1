package genericDomain;

import annotations.Observable;

@Observable
public class Person {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public static void main(String[] args) {
//		Person e = new Person();
//
//		e.addValidator("name", new ValidateStringNotEmptyException());
//
//		e.setName("Jose");
//		e.setName("Jose");
//
//		try {
//			e.setName("");
//		} catch (InvalidValueException ex) {
//			System.out.println(ex);
//		}
//
//	}

}
