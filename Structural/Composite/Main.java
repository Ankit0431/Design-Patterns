import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("CEO", "1", 350, new ArrayList<>(), new ArrayList<>());
        Employee SalesManager = new Employee("Sales Manager", "2", 220, new ArrayList<>(), new ArrayList<>());
        Employee ProductManager = new Employee("Product Manager", "3", 250, new ArrayList<>(), new ArrayList<>());
        Employee MarketingPerson1 = new Employee("Marketing Person 1", "4", 200, new ArrayList<>(), new ArrayList<>());
        Employee MarketingPerson2 = new Employee("Marketing Person 2", "5", 200, new ArrayList<>(), new ArrayList<>());
        Employee ProductionEngg1 = new Employee("Production Engg 1", "6", 180, new ArrayList<>(), new ArrayList<>());
        Employee ProductionEngg2 = new Employee("Production Engg 2", "7", 180, new ArrayList<>(), new ArrayList<>());
        Employee clerk1 = new Employee("Clerk 1", "8", 150, new ArrayList<>(), new ArrayList<>());
        Employee clerk2 = new Employee("Clerk 2", "9", 150, new ArrayList<>(), new ArrayList<>());
        CEO.addSubordinate(SalesManager);
        CEO.addSubordinate(ProductManager);
        SalesManager.addSubordinate(MarketingPerson1);
        SalesManager.addSubordinate(MarketingPerson2);
        SalesManager.addSubordinate(clerk2);
        ProductManager.addSubordinate(ProductionEngg1);
        ProductManager.addSubordinate(ProductionEngg2);
        ProductManager.addSubordinate(clerk1);
        ProductManager.addSupervisor(CEO);
        SalesManager.addSupervisor(CEO);
        MarketingPerson1.addSupervisor(SalesManager);
        MarketingPerson2.addSupervisor(SalesManager);
        ProductionEngg1.addSupervisor(ProductManager);
        ProductionEngg2.addSupervisor(ProductManager);
        clerk1.addSupervisor(ProductManager);
        clerk2.addSupervisor(SalesManager);
        // System.out.println(CEO);
        // System.out.println(SalesManager);
        // System.out.println(ProductManager);
        // System.out.println(MarketingPerson1);
        // System.out.println(MarketingPerson2);
        // System.out.println(ProductionEngg1);
        // System.out.println(ProductionEngg2);
        // System.out.println(clerk1);
        // System.out.println(clerk2);
        System.out.println(CEO.TeamSal());
    }
}
