public class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc,String holder,double balance){ super(acc,holder,balance); }
    public double calculateInterest(){ return getBalance()*0.04; }
    public boolean applyForLoan(double amount){ return getBalance()*0.5 >= amount; }
    public double calculateLoanEligibility(){ return getBalance()*0.5; }
}
