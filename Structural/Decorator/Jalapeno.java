public class Jalapeno extends Pizza implements TopingDecorator {    

    Pizza pizza;
    public Jalapeno(Pizza pizza) {  
        this.pizza = pizza;      
        pizza.addTopping(this);
    }

    public void getDescription() {
        System.out.println("Jalapeno");
    }
    public void description(){
        this.pizza.description();
    }

    public int getCost() {
        return 40;
    }
    public int Cost() {
        return this.pizza.Cost();
    }
    
}
