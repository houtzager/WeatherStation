package nl.skiphoutzager.weatherstation;

public class StatisticsDisplay implements Observer<WeatherData> {

	@Override
	public void notify(WeatherData subject) {
		System.out.println("Statistics: " + subject.getWeatherDataString());
	}

}
