package creational.builder;

public class PersonBuilder {
	
	private Person person;
	
	public PersonBuilder() {
		this.person = new Person();
	}
	
	public PersonBuilder name(String name) {
		this.person.setName(name);
		return this;
	}
	
	public PersonBuilder age(Integer age) {
		this.person.setAge(age);
		return this;
	}
	
	public PersonBuilder address(String address) {
		this.person.setAddress(address);
		return this;
	}
	
	public Person build() {
		System.out.println("Building person...");
		return this.person;
	}
	
}
