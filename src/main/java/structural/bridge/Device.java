package structural.bridge;

public interface Device {

	boolean isEnabled();
	void turnOn();
	void turnOff();
	Integer getVolume();
	void setVolume(Integer volume);
	
}
