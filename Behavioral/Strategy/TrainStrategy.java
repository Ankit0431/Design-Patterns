public class TrainStrategy implements TravelStrategy{    
    public int getCost(int distance) {
        return distance * 20;
    }
    
}
