package structural.bridge;

public class Remote {

	private Device device;
	
	public Remote(Device device) {
		this.device = device;
	}
	
	public void togglePower() {
		if(device.isEnabled()) {
			device.turnOff();
		} else {
			device.turnOn();
		}
	}
	
	public void volumeUp() {
		device.setVolume(device.getVolume() + 1);
	}
	
	public void volumeDown() {
		device.setVolume(device.getVolume() - 1);
	}
	
	public void showCurrentVolume() {
		System.out.println("Device volume >> " + device.getVolume());
	}
	
}
