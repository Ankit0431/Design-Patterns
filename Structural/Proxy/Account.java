interface Account {
    public void deposit(double amount);

    public void withdraw(double amount, int pin);

    public void changePin(int currpin, int newPin);

    public void viewAccountDetails();
}
