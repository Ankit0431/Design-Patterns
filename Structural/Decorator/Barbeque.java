public class Barbeque extends Pizza implements TopingDecorator {

    Pizza pizza;
    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
        pizza.addTopping(this);
    }

    public void getDescription() {
        System.out.println("Barbeque");
    }
    public void description(){
        this.pizza.description();
    }

    public int getCost() {
        return 90;
    }
    public int Cost() {
        return this.pizza.Cost();
    }
    
}
