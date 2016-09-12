package nl.skiphoutzager.weatherstation;

public class CurrentConditionsDisplay implements Observer<WeatherData> {

	@Override
	public void notify(WeatherData subject) {
		System.out.println("Current Conditions: " + subject.getWeatherDataString());
	}

}
