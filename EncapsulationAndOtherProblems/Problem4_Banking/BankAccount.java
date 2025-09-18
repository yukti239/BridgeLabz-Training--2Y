public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String acc,String holder,double balance){ this.accountNumber=acc; this.holderName=holder; this.balance=balance; }
    public String getAccountNumber(){ return accountNumber; }
    public String getHolderName(){ return holderName; }
    public double getBalance(){ return balance; }
    protected void setBalance(double b){ this.balance = b; }
    public void deposit(double amount){ if(amount>0) setBalance(balance+amount); }
    public boolean withdraw(double amount){ if(amount>0 && balance>=amount){ setBalance(balance-amount); return true; } return false; }
    public abstract double calculateInterest();
}
