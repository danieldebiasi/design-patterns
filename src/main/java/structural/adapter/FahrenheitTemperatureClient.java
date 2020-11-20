package structural.adapter;

public class FahrenheitTemperatureClient {
	
	private CelsiusToFahrenheitAdapter adapter;
	
	public FahrenheitTemperatureClient() {
		this.adapter = new CelsiusToFahrenheitAdapter();
	}
	
	public void showCurrentTemperature() {
		String info = new StringBuilder()
						.append("The current temperature is ")
						.append(this.adapter.getCurrentTemperature())
						.append("oF")
						.toString();
		
		System.out.println(info);
	}
	
}
