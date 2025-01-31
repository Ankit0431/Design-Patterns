public class Paneer extends Pizza implements TopingDecorator {

    Pizza pizza;
    public Paneer(Pizza pizza) {
        this.pizza = pizza;
        pizza.addTopping(this);
    }

    public void getDescription() {
        System.out.println("Paneer");
    }
    public void description(){
        this.pizza.description();
    }

    public int getCost() {
        return 70;
    }
    public int Cost() {
        return this.pizza.Cost();
    }
    
}
