package creational.builder;

public class Main {
	
	public static void main(String[] args) {
		Person person = new PersonBuilder()
							.name("Fulano")
							.age(30)
							.address("Paulista Avenue")
							.build();
		
		System.out.println("Person successfully built!");
		System.out.println(person.toString());
	}
	
}
