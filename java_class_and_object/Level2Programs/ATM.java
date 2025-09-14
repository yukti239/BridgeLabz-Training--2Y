public class ATM {
    String accountHolder;
    String accountNumber;
    double balance;
    
    ATM(String holder, String accNum, double balance) {
        this.accountHolder = holder;
        this.accountNumber = accNum;
        this.balance = balance;
    }
    
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {
        ATM acc = new ATM("Bob", "ACC123", 5000);
        acc.display();
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.withdraw(5000);
    }
}