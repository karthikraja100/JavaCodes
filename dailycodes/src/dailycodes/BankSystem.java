package dailycodes;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                balance += amount;
                System.out.println("Deposit successful!");
            } 
            else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                if (amount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    balance -= amount;
                    System.out.println("Withdrawal successful!");
                }
            } 
            else if (choice == 3) {
                System.out.println("Balance: " + balance);
            } 
            else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
