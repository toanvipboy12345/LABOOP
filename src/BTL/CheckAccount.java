package BTL;

public class CheckAccount extends Account {
    private double FeeTransfer; // Phí giao dịch

    public CheckAccount(double balance, double feeTransfer) {
        super(balance);
        this.FeeTransfer = feeTransfer;
    }

    @Override
    public void Deposit(double money) {
        if (money > FeeTransfer) {
            balance += (money - FeeTransfer);
            System.out.println("Deposited: " + money + " (Fee: " + FeeTransfer + "). New balance: " + balance);
        } else {
            System.out.println("Deposit amount is less than the fee.");
        }
    }

    @Override
    public void WithDraw(double money) {
        if (money + FeeTransfer <= balance) {
            balance -= (money + FeeTransfer);
            System.out.println("Withdrawn: " + money + " (Fee: " + FeeTransfer + "). New balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw with fee.");
        }
    }
}
