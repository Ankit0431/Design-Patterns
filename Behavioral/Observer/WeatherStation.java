import java.util.*;
class WeatherStation implements Subject {
    private List<Observer> observers;
    float temperature;
    public WeatherStation() {
        observers = new ArrayList<Observer>();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("Weather station temperature is " + temperature);
        System.out.println("Notifying observers");
        notifyObservers();
    }
}