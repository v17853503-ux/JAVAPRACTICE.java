class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double openingBalance) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("Owner name cannot be null or empty.");
        }
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        this.owner = owner;
        this.balance = openingBalance;
    }

    public double getBalance() { return balance; }
    public String getOwner() { return owner; }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit failed: Amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Successfully deposited $" + amount + ". Current balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Withdrawal failed: Insufficient funds. Current balance: $" + balance);
            return;
        }
        balance -= amount;
        System.out.println("Successfully withdrew $" + amount + ". Current balance: $" + balance);
    }
}

public class BankAccountExB {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Charlie", 500.0);
        
        account.deposit(150.0);
        account.withdraw(200.0);

        System.out.println("\n--- Testing Invalid Transactions ---");
        account.deposit(-50.0);
        account.withdraw(1000.0);
    }
}
