class SavingsAccount extends BankAccount {

    SavingsAccount(double bal) {
        super(bal);
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {

        if ((balance - amt) >= 1000) {
            balance -= amt;
        } 
        
        else {
            System.out.println("Minimum balance of 1000 must be maintained.");
        }
    }
}