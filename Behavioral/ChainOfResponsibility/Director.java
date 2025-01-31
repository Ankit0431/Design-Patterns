public class Director extends LoanApprover {
    Director() {
        super();
    }
    Director(LoanApprover nextApprover) {
        super(nextApprover);
    }
    public void approveLoan(Loan loan) {
        if (loan.getAmount() < 1000000)
            System.out.println("Director approves loan of amount " + loan.getAmount() + " for purpose "
                    + loan.getPurpose() + " by " + loan.getApplier());
        else {
            nextApprover.approveLoan(loan);
        }
    }

}
