package com.humber.asgmnts;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for account ID
        System.out.print("Enter ID: ");
        int accountId = scanner.nextInt();

        // Create an instance of the Account class
        Account account1 = new Account();
        account1.setId(accountId);
        
        // Set the initial balance below
        account1.setBalance(1000.0); 

        int choice;
        while (true) {
            // Main menu options
            System.out.println("Main menu");
            System.out.println("1: Check for balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");

            // Input for user choice
            System.out.print("Enter a choice: ");
            choice = scanner.nextInt();

            // Consume the newline character left in the buffer
            scanner.nextLine();

            if (choice == 1) {
                // Display balance
                System.out.println("The balance is: $" + formatCurrency(account1.getBalance()));
            } else if (choice == 2) {
                // Withdraw
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount <= account1.getBalance()) {
                    account1.setBalance(account1.getBalance() - withdrawAmount);
                    System.out.println("Withdraw successful.");
                } else {
                    System.out.println("Insufficient balance for withdrawal.");
                }
            } else if (choice == 3) {
                // Deposit
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                account1.setBalance(account1.getBalance() + depositAmount);
                System.out.println("Deposit successful.");
            } else if (choice == 4) {
                // Exit
                System.out.println("Exiting the program.");
                // Exit the loop when choice is 4
                break; 
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            // Add an empty line after each iteration, code below
            System.out.println();
        }

        scanner.close();
    }

    // Helper method to format currency with two decimal places, found in google
    private static String formatCurrency(double amount) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(amount);
    }
}
