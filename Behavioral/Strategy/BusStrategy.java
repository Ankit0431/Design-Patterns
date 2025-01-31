public class BusStrategy implements TravelStrategy{
    public int getCost(int distance) {
        return distance * 10;
    }
}
