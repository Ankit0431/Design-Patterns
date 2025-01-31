public class FreshTomato extends Pizza implements TopingDecorator {

    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
        pizza.addTopping(this);
    }

    public void getDescription() {
        System.out.println("Fresh Tomatoes");
    }
    public void description(){
        this.pizza.description();
    }
    public int Cost() {
        return this.pizza.Cost();
    }

    public int getCost() {
        return 60;
    }
    
}
