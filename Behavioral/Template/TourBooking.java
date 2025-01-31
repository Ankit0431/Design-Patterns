abstract class TourBooking {
    // Template method
    public final void bookTour() {
        selectDestination();
        bookTransport();
        bookAccommodation();
        arrangeSightseeing();
        makePayment();
    }

    abstract void selectDestination();
    abstract void bookTransport();
    abstract void bookAccommodation();
    abstract void arrangeSightseeing();
   
    void makePayment() {
        System.out.println("Making payment for the tour.");
    }
}