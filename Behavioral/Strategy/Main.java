public class Main {
    public static void main(String[] args) {
        TravelCostCalculator travelCostCalculator = new TravelCostCalculator();
        travelCostCalculator.setStrategy(new TrainStrategy());
        System.out.println(travelCostCalculator.calculateCost(10));
        travelCostCalculator.setStrategy(new BusStrategy());
        System.out.println(travelCostCalculator.calculateCost(10));
        travelCostCalculator.setStrategy(new FlightStrategy());
        System.out.println(travelCostCalculator.calculateCost(10));
    }
}
