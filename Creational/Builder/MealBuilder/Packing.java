package MealBuilder;

abstract class Packing {
    public String type;
    public Packing(String type){
        this.type = type;
    }
    public abstract void pack();
    @Override
    public String toString() {
        return type;
    }
}
