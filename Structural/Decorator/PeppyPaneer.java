public class PeppyPaneer extends Pizza {

    public PeppyPaneer() {
        super("Peppy Paneer", 250);
    }
    public void addTopping(TopingDecorator topping) {
        toppings.add(topping);
    }

    public void description() {
        System.out.println(this.getName()+" Pizza with toppings: ");
        for (TopingDecorator topingDecorator : toppings) {
            topingDecorator.getDescription();
        }
    }

    public int Cost() {
        int cost = this.getCost();
        for (TopingDecorator topingDecorator : toppings) {
            cost += topingDecorator.getCost();
        }
        return cost;
    }
}
