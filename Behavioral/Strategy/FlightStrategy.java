public class FlightStrategy implements TravelStrategy {
    public int getCost(int distance) {
        return distance * 30;
    }
}
