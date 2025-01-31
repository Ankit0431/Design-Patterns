public abstract class LoanApprover {
    protected LoanApprover nextApprover;
    protected LoanApprover defaultHandler;
    
    public LoanApprover() {
        nextApprover = null;
    }

    public LoanApprover(LoanApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveLoan(Loan loan);

    public void setNextApprover(LoanApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public LoanApprover getNextApprover() {
        return nextApprover;
    }

}