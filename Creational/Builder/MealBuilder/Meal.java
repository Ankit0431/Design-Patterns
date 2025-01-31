package MealBuilder;
import java.util.*;

public class Meal {
    private ArrayList<Item> items;
    public double cost;
    
    Meal(){
        items = new ArrayList<>();
    }
    public void addItem(Item item){
        items.add(item);
        return;
    }
    public double getCost(){
        double sum = 0;
        for (Item i : items) {
            sum += i.price;
        }
        this.cost = sum;
        return sum;
    }
    public void showItems(){
        System.out.println("Items in the meal: ");
        for (Item i : items) {
            System.out.println(i);
        }
        return;
    }
}
