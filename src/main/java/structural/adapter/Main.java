package structural.adapter;

public class Main {
	
	public static void main(String[] args) {
		
		CelsiusTemperatureService celsiusService = CelsiusTemperatureService.getInstance();
		celsiusService.setCurrentTemperature(Float.valueOf(20));
		
		CelsiusTemperatureClient celsiusClient = new CelsiusTemperatureClient();
		FahrenheitTemperatureClient fahrenheitClient = new FahrenheitTemperatureClient();
		
		celsiusClient.showCurrentTemperature();
		fahrenheitClient.showCurrentTemperature();
		
		System.out.println("Changing temperature...");
		celsiusService.setCurrentTemperature(Float.valueOf(25));
		
		celsiusClient.showCurrentTemperature();
		fahrenheitClient.showCurrentTemperature();
		
	}
	
}
