public class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc,String holder,double balance){ super(acc,holder,balance); }
    public double calculateInterest(){ return 0; }
}
