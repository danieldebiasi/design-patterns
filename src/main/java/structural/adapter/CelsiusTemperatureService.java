package structural.adapter;

public class CelsiusTemperatureService {

	private float currentTemperature = 25;
	private static CelsiusTemperatureService celsiusTempService;

	private CelsiusTemperatureService() {}
	
	public static CelsiusTemperatureService getInstance() {
		if(celsiusTempService == null) {
			celsiusTempService = new CelsiusTemperatureService();
		}
		
		return celsiusTempService;
	}
	
	public float getCurrentTemperature() {
		return currentTemperature;
	}

	public void setCurrentTemperature(Float currentTemperature) {
		this.currentTemperature = currentTemperature;
	}
	
}
