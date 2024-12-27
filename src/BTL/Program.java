package BTL;

public class Program {
    public static void main(String[] args) {
        // Test Account
        Account acc = new Account(1000);
        acc.Deposit(500);
        acc.WithDraw(300);
        System.out.println("Account balance: " + acc.GetBalance());

        // Test SavingAccount
        SavingAccount savingAcc = new SavingAccount(2000, 0.05);
        System.out.println("Interest: " + savingAcc.GetInterest());

        // Test CheckAccount
        CheckAccount checkAcc = new CheckAccount(1500, 10);
        checkAcc.Deposit(200);
        checkAcc.WithDraw(100);
        System.out.println("CheckAccount balance: " + checkAcc.GetBalance());
    }
}
