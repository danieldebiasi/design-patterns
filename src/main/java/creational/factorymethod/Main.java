package creational.factorymethod;

public class Main {

	public static void main(String[] args) {
		Company company = new TruckTransportCompany();
		//Company company = new ShipTransportCompany();
		
		TransportVehicle vehicle = company.createTransportVehicle();
		
		vehicle.deliver();
	}
	
}
