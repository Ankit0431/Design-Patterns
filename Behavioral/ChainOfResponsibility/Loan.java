public class Loan {
    private double amount;
    private String purpose;
    private String applier;

    public Loan(double amount, String purpose, String applier) {
        this.amount = amount;
        this.purpose = purpose;
        this.applier = applier;
    }

    public double getAmount() {
        return amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getApplier() {
        return applier;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setApplier(String applier) {
        this.applier = applier;
    }
}
