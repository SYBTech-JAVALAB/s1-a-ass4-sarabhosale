import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Account Type");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int choice = sc.nextInt();

        System.out.println("Enter Initial Balance:");
        double bal = sc.nextDouble();

        BankAccount acc;

        if (choice == 1) {
            acc = new SavingsAccount(bal);
        } 
        
        else {
            acc = new CurrentAccount(bal);
        }

        System.out.println("Enter Amount to Deposit:");
        double amt = sc.nextDouble();
        acc.deposit(amt);

        System.out.println("Enter Amount to Withdraw:");
        amt = sc.nextDouble();
        acc.withdraw(amt);

        acc.display();
    }
}