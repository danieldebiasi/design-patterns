package creational.prototype;

public abstract class Vehicle {

	protected String model;
	protected Integer year;
	
	public Vehicle() {}
	
	public Vehicle(Vehicle vehicle) {
		this.model = vehicle.model;
		this.year = vehicle.year;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public Integer getYear() {
		return this.year;
	}
	
	// O Java permite a aplicação do padrão Prototype por padrão 
	// através da interface cloneable. A implementação deste exemplo
	// é feita sem a utilização dela.
	public abstract Vehicle clone();
	
}
