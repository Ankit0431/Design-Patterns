package MealBuilder;

public class Burger extends Item{

    Burger(){}
    public Burger(String name, Packing packing, double price){
        super(name, packing, price);
    }
    public void pack(){
        this.packing.pack();
    }
}
