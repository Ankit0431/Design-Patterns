public class WeatherApp implements Observer {
    float temperature;
    public void update(float temperature) {
        System.out.println("The temperature in WeatherApp is " + temperature);
    }
}
