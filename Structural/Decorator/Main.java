public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Barbeque(new FreshTomato(new Jalapeno (new Paneer(new PeppyPaneer()))));

        pizza.description();
        System.out.println(pizza.Cost());
        
    }
}
