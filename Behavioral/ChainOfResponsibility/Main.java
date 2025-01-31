public class Main {
    public static void main(String[] args) {
        LoanApprover vicePresident = new VicePresident(null);
        LoanApprover director = new Director(vicePresident);
        LoanApprover manager = new Manager(director);
        // manager.setNextApprover(director);
        // director.setNextApprover(vicePresident);
        // vicePresident.setNextApprover(null);
        Loan loan1 = new Loan(100000, "Computer", "Ankit");
        Loan loan2 = new Loan(600000, "Very Big Computer", "Ankit");
        Loan loan3 = new Loan(1900000, "Extreamly Big Computer", "Ankit");
        Loan loan4 = new Loan(2500000, "Many Computers", "Ankit");
        
        manager.approveLoan(loan1);
        manager.approveLoan(loan2);
        manager.approveLoan(loan3);
        manager.approveLoan(loan4);
    }
}
