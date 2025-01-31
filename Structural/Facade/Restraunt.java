public class Restraunt {
    private String name;
    private int capacity;
    private int count;

    Restraunt() {
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCount() {
        return count;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    Restraunt(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.count = 0;
    }

    public void serve(Eater e) {
        System.out.println("Served " + e.getName() + " at " + name);
        e.removeReservation(this);
        count--;
    }

    public void reserve(Eater e) {
        if (count < capacity) {
            System.out.println("Reserving " + e.getName() + " at " + name);
            e.addReservation(this);
            count++;
        } else {
            System.out.println("No space left at " + name);
        }

    }

    public void cancel(Eater e) {
        System.out.println("Cancelling " + e.getName() + " at " + name);
        e.removeReservation(this);
        count--;
    }

}
