package nl.skiphoutzager.weatherstation;

public interface Observer<T> {
	public void notify(T subject);
}
