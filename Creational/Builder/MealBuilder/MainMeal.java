package MealBuilder;

public class MainMeal {
    public static void main(String[] args) {
        MealBuilder m = new MealBuilder();
        Meal m1 = m.prepareVegMeal();
        m1.showItems();
        System.out.println("Total Cost = Rs."+m1.cost);
        System.out.println();
        Meal m2 = m.prepareNonVegMeal();
        m2.showItems();
        System.out.println("Total Cost = Rs."+m2.cost);
    }
}
