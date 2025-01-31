public class Main {
    public static void main(String[] args) {
        ATM a = new ATM(1778542365, 25000.00, "Ankit Pande", 1234);
        a.viewAccountDetails();
        a.deposit(1250);
        a.withdraw(6500, 1234);
        a.changePin(1234, 6523);
        a.withdraw(6500, 1234);
        a.withdraw(6500, 6523);
        a.viewAccountDetails();
    }
}
