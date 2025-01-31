import java.util.ArrayList;

public class Pizza {
    private String name;
    private int price;
    ArrayList<TopingDecorator> toppings;

    public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
        toppings = new ArrayList<TopingDecorator>();
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void description(){
    }

    public int getCost(){
        return 0;
    }

    public void addTopping(TopingDecorator topping){
    }
    public int Cost(){
        return 0;
    }

}
