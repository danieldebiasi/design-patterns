package creational.prototype;

public class Truck extends Vehicle {

	private boolean isLoaded;
	
	public Truck() {}
	
	public Truck(Truck truck) {
		super(truck);
		this.isLoaded = truck.isLoaded;
	}
	
	public void setIsLoaded(boolean isLoaded) {
		this.isLoaded = isLoaded;
	}
	
	@Override
	public Vehicle clone() {
		return new Truck(this);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("{model: ").append(this.getModel())
				.append(", year: ").append(this.getYear())
				.append(", isLoaded: ").append(this.isLoaded)
				.append("}").toString();
	}

}
