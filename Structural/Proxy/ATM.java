public class ATM implements Account{
    Bank b;
    ATM(int accno, double balance, String accHolderName, int pin){
        b = new Bank(accno, balance, accHolderName, pin);
    }
    public void deposit(double amount) {
        b.deposit(amount);
    }

    public void withdraw(double amount, int pin) {
        b.withdraw(amount, pin);
    }

    public void changePin(int currpin, int newPin) {
        b.changePin(currpin,newPin);
    }

    public void viewAccountDetails() {
        b.viewAccountDetails();
    }

}
