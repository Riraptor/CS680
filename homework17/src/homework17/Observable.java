package homework17;

import java.util.ArrayList;

public class Observable {
	boolean changed;
	ArrayList<Observer> observers;
	public Observable() {
		observers = new ArrayList<>();
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void setChanged() {
		changed = true;
	}
	public boolean hasChanged() {
		return changed;
	}
	public void  clearChanged() {
		changed = false;
	}
	public void notifyObservers() {
		notifyObservers(null);
		
	}
	public void notifyObservers(Object arg) {
		if( hasChanged()) {
			for (Observer obsr: observers) {
				obsr.update(this, arg);
			}
			clearChanged();
		}
	}
}
