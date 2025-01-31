package MealBuilder;

abstract class Item {
    public String name;
    public Packing packing;
    public double price;

    Item() {
    }

    Item(String name,Packing packing,double price){
        this.name = name;
        this.packing = packing;
        this.price = price;
    }
    public abstract void pack();

    @Override
    public String toString() {
        return "Item name: " + name + "\nPacking: " + packing + "\nPrice: Rs." + price;
    }
}
