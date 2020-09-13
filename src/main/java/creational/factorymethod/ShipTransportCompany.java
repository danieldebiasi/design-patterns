package creational.factorymethod;

public class ShipTransportCompany extends Company {

	@Override
	protected TransportVehicle createTransportVehicle() {
		return new Ship();
	}

}
