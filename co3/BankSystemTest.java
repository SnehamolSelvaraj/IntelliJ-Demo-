abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) { this.balance = balance; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) { super(balance); }

    @Override
    public void deposit(double amount) { setBalance(getBalance() + amount); }

    @Override
    public boolean withdraw(double amount) {
        if(amount <= getBalance()) { setBalance(getBalance() - amount); return true; }
        return false;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) { super(balance); }

    @Override
    public void deposit(double amount) { setBalance(getBalance() + amount); }

    @Override
    public boolean withdraw(double amount) {
        // Allow overdraft up to 1000
        if(amount <= getBalance() + 1000) { setBalance(getBalance() - amount); return true; }
        return false;
    }
}

public class BankSystemTest {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(5000);
        CurrentAccount c = new CurrentAccount(2000);

        s.deposit(1000);
        c.withdraw(2500);

        System.out.println("Savings Balance: " + s.getBalance());
        System.out.println("Current Balance: " + c.getBalance());
    }
}
