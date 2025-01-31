public class TravelCostCalculator {
    TravelStrategy strategy;
    TravelCostCalculator(){}
    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }
    public int calculateCost(int distance){
        if(strategy == null)
            return -1;
        return strategy.getCost(distance);
    }

}
