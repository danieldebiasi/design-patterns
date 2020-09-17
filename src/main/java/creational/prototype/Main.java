package creational.prototype;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.model = "Chevrolet Onix";
		car.year = 2018;
		car.setIsRacingCar(false);
		
		Truck truck = new Truck();
		truck.model = "Scania";
		truck.year = 2015;
		truck.setIsLoaded(true);
		
		Car carClone = (Car) car.clone();
		Truck truckClone = (Truck) truck.clone();
		
		System.out.println("Car: " + car.toString());
		System.out.println("Car (clone): " + carClone.toString());
		System.out.println("Truck: " + truck.toString());
		System.out.println("Truck (clone): " + truckClone.toString());
	}
	
}
