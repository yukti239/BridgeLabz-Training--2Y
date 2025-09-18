public class Problem4Main {
    public static void main(String[] args){
        BankAccount s = new SavingsAccount("SA001","Ravi",100000);
        BankAccount c = new CurrentAccount("CA001","Neha",50000);
        System.out.println("Savings Interest: "+s.calculateInterest());
        System.out.println("Current Interest: "+c.calculateInterest());
        System.out.println("Loan Eligibility: "+((Loanable)s).calculateLoanEligibility());
    }
}
