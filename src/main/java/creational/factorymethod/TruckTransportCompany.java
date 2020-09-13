package creational.factorymethod;

public class TruckTransportCompany extends Company {

	@Override
	protected TransportVehicle createTransportVehicle() {
		return new Truck();
	}

}
