package creational.abstractfactory;

public class VintageFurnitureFactory implements AbstractFactory {

	public Chair createChair() {
		return new VintageChair();
	}

	public Couch createCouch() {
		return new VintageCouch();
	}
	
}
