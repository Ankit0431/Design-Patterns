import java.util.ArrayList;

public class Eater {
    private String name;
    private ArrayList<Restraunt> reservations;

    Eater() {
    }

    Eater(String name, ArrayList<Restraunt> reservations) {
        this.name = name;
        this.reservations = reservations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReservations(ArrayList<Restraunt> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(Restraunt r) {
        reservations.add(r);
    }

    public void removeReservation(Restraunt r) {
        reservations.remove(r);
    }

    public void printReservations() {
        for (Restraunt r : reservations) {
            System.out.println(r.getName());
        }
    }

    public ArrayList<Restraunt> getReservations() {
        return reservations;
    }
}
