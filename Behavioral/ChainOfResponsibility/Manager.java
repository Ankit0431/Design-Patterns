public class Manager extends LoanApprover {
    public Manager() {
        super();
    }
    Manager(LoanApprover nextApprover) {
        super(nextApprover);
    }
    public void approveLoan(Loan loan) {
        if (loan.getAmount() < 500000)
            System.out.println("Manager approves loan of amount " + loan.getAmount() + " for purpose "
                    + loan.getPurpose() + " by " + loan.getApplier());
        else {
            nextApprover.approveLoan(loan);
        }
    }
}
