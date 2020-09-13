package creational.abstractfactory;

public class ModernFurnitureFactory implements AbstractFactory {

	public Chair createChair() {
		return new ModernChair();
	}

	public Couch createCouch() {
		return new ModernCouch();
	}

}
