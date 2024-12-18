package bankSystem;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private static double balance;
    static {
        balance = 0;
    }

    public void deposite(double money) {
        balance += money;
        System.out.println(balance);
    }

    public void withdraw(double money) {
        if (balance < money) {
            System.out.println("You don't have enough money to withdraw! Thank You :)");
        } else {
            balance -= money;
            System.out.println("You have withdrawed " + money + " rupees. Thank you :)");
            System.out.println("Your current balace is : " + balance);
        }
    }

    public double currentBalance() {
        return balance;
    }

}
