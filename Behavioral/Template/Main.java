public class Main {
    public static void main(String[] args) {
        TourBooking luxuryTour = new LuxuryTourBooking();
        luxuryTour.bookTour();
       
        TourBooking budgetTour = new BudgetTourBooking();
        budgetTour.bookTour();
    }
}

