package structural.adapter;

public class CelsiusTemperatureClient {

	private CelsiusTemperatureService celsiusTempService;
	
	public CelsiusTemperatureClient() {
		this.celsiusTempService = CelsiusTemperatureService.getInstance();
	}
	
	public void showCurrentTemperature() {
		String info = new StringBuilder()
						.append("The current temperature is ")
						.append(this.celsiusTempService.getCurrentTemperature())
						.append("oC")
						.toString();
		
		System.out.println(info);
	}
	
}
