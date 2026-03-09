class CurrentAccount extends BankAccount {

    CurrentAccount(double bal) {
        super(bal);
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {

        if ((balance - amt) >= -5000) {
            balance -= amt;
        } 
        
        else {
            System.out.println("Overdraft limit of 5000 exceeded.");
        }
    }
}