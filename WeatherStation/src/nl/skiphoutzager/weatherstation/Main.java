package nl.skiphoutzager.weatherstation;

public class Main {

	public static void main(String[] args) {
		SubjectManager<WeatherData> subjectManager = new SubjectManager<WeatherData>();
		subjectManager.registerObserver(new StatisticsDisplay());
		subjectManager.notifyObservers(new WeatherData("Its going to be raining all day tomorrow!"));
		subjectManager.registerObserver(new CurrentConditionsDisplay());
		subjectManager.notifyObservers(new WeatherData("It will be freezy cold tonight! Wear gloves!"));
	}

}
