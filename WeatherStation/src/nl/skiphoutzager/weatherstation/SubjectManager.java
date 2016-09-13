package nl.skiphoutzager.weatherstation;

import java.util.ArrayList;
import java.util.Collection;

public class SubjectManager<T> {

	private Collection<Observer<T>> observerList = new ArrayList<Observer<T>>();

	public void registerObserver(Observer<T> observer) {
		observerList.add(observer);
	}

	public void removeObserver(Observer<T> observer) {
		observerList.remove(observer);
	}

	public void notifyObservers(T subject) {
		for(Observer<T> observer : observerList) {
			observer.notify(subject);
		}
	}
}
