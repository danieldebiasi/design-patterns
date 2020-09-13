package creational.abstractfactory;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = new ModernFurnitureFactory();
		//AbstractFactory factory = new VintageFurnitureFactory();
		
		Chair chair = factory.createChair();
		Couch couch = factory.createCouch();
		
		chair.create();
		couch.create();
	}
	
}
