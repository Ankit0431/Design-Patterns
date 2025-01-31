public class DefaultHandler extends LoanApprover {
    DefaultHandler() {
        super();
    }
    public void approveLoan(Loan loan) {
        System.out.println("Rejecting loan of amount " + loan.getAmount() + " for purpose " + loan.getPurpose() + " by " + loan.getApplier());
    }
    
}
