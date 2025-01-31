package MealBuilder;

public class ColdDrink extends Item{
    ColdDrink(){}
    public ColdDrink(String name, Packing packing, double price){
        super(name, packing, price);
    }
    public void pack(){
        this.packing.pack();
    }
}
