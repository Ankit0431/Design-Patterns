public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new WeatherApp());
        weatherStation.addObserver(new DisplayScreen());
        weatherStation.setTemperature(30);
        weatherStation.setTemperature(40);
        weatherStation.setTemperature(50);
    }
}
