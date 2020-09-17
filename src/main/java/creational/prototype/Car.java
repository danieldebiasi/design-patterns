package creational.prototype;

public class Car extends Vehicle {

	private boolean isRacingCar;
	
	public Car() {}
	
	public Car(Car car) {
		super(car);
		this.isRacingCar = car.isRacingCar;
	}
	
	public void setIsRacingCar(boolean isRacingCar) {
		this.isRacingCar = isRacingCar;
	}
	
	@Override
	public Vehicle clone() {
		return new Car(this);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("{model: ").append(this.getModel())
				.append(", year: ").append(this.getYear())
				.append(", isRacingCar: ").append(this.isRacingCar)
				.append("}").toString();
	}

}
