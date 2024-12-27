package BTL;

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void Deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Deposited: " + money + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void WithDraw(double money) {
        if (money > 0 && money <= balance) {
            balance -= money;
            System.out.println("Withdrawn: " + money + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double GetBalance() {
        return balance;
    }
}
