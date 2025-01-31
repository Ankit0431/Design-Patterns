import java.util.ArrayList;

public class HotelKeeperFacade {
    ArrayList<Restraunt> restaurants;
    ArrayList<Eater> eaters;

    HotelKeeperFacade() {
        restaurants = new ArrayList<Restraunt>();
        eaters = new ArrayList<Eater>();
    }

    public void addRestraunt(Restraunt r) {
        restaurants.add(r);
    }

    public void addEater(Eater e) {
        eaters.add(e);
    }

    public void reserveEater(Eater e, Restraunt r) {
        r.reserve(e);
    }

    public void cancelEater(Eater e, Restraunt r) {
        r.cancel(e);
    }

    public void serveEater(Eater e, Restraunt r) {
        r.serve(e);
    }
    public void showRestraunts() {
        for (Restraunt r : restaurants) {
            System.out.println(r.getName() + " has " + r.getCount() + " guests" + " and capacity of " + r.getCapacity());
        }
    }
    public void showReservations(Eater e) {
        e.printReservations();
    }

}