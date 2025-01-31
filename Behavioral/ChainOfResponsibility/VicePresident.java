public class VicePresident extends LoanApprover {
    VicePresident() {
        super();
    }
    VicePresident(LoanApprover nextApprover) {
        super(nextApprover);
    }
    public void approveLoan(Loan loan) {
        if(loan.getAmount() < 2000000)
            System.out.println("VicePresident approves loan of amount " + loan.getAmount() + " for purpose " + loan.getPurpose() + " by " + loan.getApplier());
        else {
            System.out.println("Rejecting loan of amount " + loan.getAmount() + " for purpose " + loan.getPurpose() + " by " + loan.getApplier());
        }
    }
    
}
