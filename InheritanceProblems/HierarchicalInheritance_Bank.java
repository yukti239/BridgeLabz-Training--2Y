
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class HierarchicalInheritance_Bank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("S123", 2000, 5.0);
        sa.displayAccountType();
    }
}
