abstract class BankAccount {
    
    protected double balance;

    BankAccount(double bal) {
        balance = bal;
    }

    public abstract void deposit(double amt);
    public abstract void withdraw(double amt);

    public void display() {
        System.out.println("Balance = " + balance);
    }
}