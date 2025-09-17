class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Yukti", 101);
        BankAccount acc2 = new BankAccount("Aman", 102);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}