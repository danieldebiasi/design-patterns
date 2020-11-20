package structural.adapter;

public class CelsiusToFahrenheitAdapter {

	private CelsiusTemperatureService celsiusTempService;
	
	public CelsiusToFahrenheitAdapter() {
		this.celsiusTempService = CelsiusTemperatureService.getInstance();
	}
	
	public float getCurrentTemperature() {
		float celsiusTemp = celsiusTempService.getCurrentTemperature();
		
		return (float) (celsiusTemp * 1.8 + 32);
	}
	
}
