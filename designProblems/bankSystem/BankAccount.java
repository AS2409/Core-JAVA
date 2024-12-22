package designProblems.bankSystem;

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

    // Equals and hashcode method..
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode(); // to use methodes of object class we use super keyword. Here we are returning
                                 // the resuls from object class hascode method
    }

    public double currentBalance() {
        return balance;
    }

}
