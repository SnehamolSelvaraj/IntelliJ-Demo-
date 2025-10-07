class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    static int accountCount = 0;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        accountCount++;
        this.accountNumber = 1000 + accountCount;
    }

    public boolean withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public Transaction transferTo(BankAccount target, double amount) {
        if(this.withdraw(amount)) {
            target.deposit(amount);
            return new Transaction(this.accountNumber, target.accountNumber, amount, "Success");
        } else {
            return new Transaction(this.accountNumber, target.accountNumber, amount, "Failed");
        }
    }

    public void displayAccount() {
        System.out.println("AccountNo: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class Transaction {
    private int fromAccount;
    private int toAccount;
    private double amount;
    private String status;

    public Transaction(int from, int to, double amount, String status) {
        this.fromAccount = from;
        this.toAccount = to;
        this.amount = amount;
        this.status = status;
    }

    public void displayTransaction() {
        System.out.println("From: " + fromAccount + ", To: " + toAccount + ", Amount: " + amount + ", Status: " + status);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 2000);

        Transaction t1 = acc1.transferTo(acc2, 1000); // success
        Transaction t2 = acc2.transferTo(acc1, 5000); // failed

        acc1.displayAccount();
        acc2.displayAccount();

        t1.displayTransaction();
        t2.displayTransaction();
    }
}
