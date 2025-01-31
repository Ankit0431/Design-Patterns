package MealBuilder;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Pepsi());
        m.cost = m.getCost();
        System.out.println("Veg meal prepared: ");
        // m.showItems();
        return m;
    }
    public Meal prepareNonVegMeal(){
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new Coke());
        m.cost = m.getCost();
        System.out.println("Non Veg meal prepared: ");
        // m.showItems();
        return m;
    }
}
