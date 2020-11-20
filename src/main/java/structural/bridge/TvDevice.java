package structural.bridge;

public class TvDevice implements Device {

	private boolean enabled = false;
	private Integer volume = 0;
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void turnOn() {
		enabled = true;
		System.out.println("Turning TV on...");	
	}

	public void turnOff() {
		enabled = false;
		System.out.println("Turning TV off...");	
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

}
