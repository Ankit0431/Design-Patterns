public class Bank implements Account {
    private int accno;
    private double balance;
    private String accHolderName;
    private int pin;

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Bank() {
    }

    public Bank(int accno, double balance, String accHolderName, int pin) {
        this.accno = accno;
        this.balance = balance;
        this.accHolderName = accHolderName;
        this.pin = pin;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount Credited!");
        System.out.println("Current Balance: Rs." + balance + "/-");
    }

    public void withdraw(double amount, int pin) {
        if (this.pin == pin) {
            if (amount <= balance) {
                this.balance -= amount;
                System.out.println("Amount Debited!");
                System.out.println("Current Balance: Rs." + balance + "/-");
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Incorrect pin");
        }
    }

    public void changePin(int currpin, int newPin) {
        if (this.pin == currpin) {
            this.pin = newPin;
            System.out.println("Pin changed successfully!");
        }
        else{
            System.out.println("Incorrect current pin");
        }
    }

    public void viewAccountDetails() {
        System.out.println("Account Number: " + accno);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Balance: Rs." + balance + "/-");
    }
}