package BTL;

public class SavingAccount extends Account {
    private double rate; // Lãi suất

    public SavingAccount(double balance, double rate) {
        super(balance);
        this.rate = rate;
    }

    public double GetInterest() {
        return balance * rate;
    }
}
