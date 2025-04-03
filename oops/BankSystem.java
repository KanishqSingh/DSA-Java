package oops;

import java.util.*;

class Bank {
    private int acc_number, amount;
    private String name, nominee;

    // Constructor
    Bank(String name, int amount, int acc_number, String nominee) {
        this.name = name;
        this.amount = amount;
        this.acc_number = acc_number;
        this.nominee = nominee;
    }

    // Getter functions
    public String getName() { return name; }
    public int getAccNumber() { return acc_number; }
    public int getAmount() { return amount; }
    public String getNominee() { return nominee; }

    // Deposit money
    public void deposit(int money) {
        if (money > 0) {
            this.amount += money;
            System.out.println("Deposited " + money + ". New Balance: " + this.amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public boolean withdraw(int money) {
        if (money > 0 && this.amount >= money) {
            this.amount -= money;
            System.out.println("Withdrawn " + money + ". New Balance: " + this.amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + acc_number);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + amount);
        System.out.println("Nominee: " + nominee);
    }
}

// Inner Bank System
class InnerBankSystem {
    private List<Bank> banks = new ArrayList<>();

    // Add user
    void addUser(Bank bank) {
        banks.add(bank);
        System.out.println("Account created successfully for " + bank.getName());
    }

    // Search account by account number
    Bank searchByAccountNumber(int accNum) {
        for (Bank bank : banks) {
            if (bank.getAccNumber() == accNum) {
                return bank;
            }
        }
        System.out.println("Account not found!");
        return null;
    }

    // Deposit money
    void addMoney(int accNum, int money) {
        Bank bank = searchByAccountNumber(accNum);
        if (bank != null) {
            bank.deposit(money);
        }
    }

    // Withdraw money
    void withdrawMoney(int accNum, int money) {
        Bank bank = searchByAccountNumber(accNum);
        if (bank != null) {
            bank.withdraw(money);
        }
    }

    // Close account
    void closeAccount(int accNum) {
        Bank bank = searchByAccountNumber(accNum);
        if (bank != null) {
            banks.remove(bank);
            System.out.println("Account closed successfully.");
        }
    }
}

// Main Class
public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InnerBankSystem bankSystem = new InnerBankSystem();

        while (true) {
            System.out.println("\nBank System Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Search Account");
            System.out.println("6. Close Account");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Account Holder's Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Initial Deposit Amount: ");
                    int amount = scanner.nextInt();
                    System.out.print("Enter Account Number: ");
                    int accNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Nominee Name: ");
                    String nominee = scanner.nextLine();
                    
                    bankSystem.addUser(new Bank(name, amount, accNumber, nominee));
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = scanner.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    int depAmount = scanner.nextInt();
                    bankSystem.addMoney(depAcc, depAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int withAcc = scanner.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    int withAmount = scanner.nextInt();
                    bankSystem.withdrawMoney(withAcc, withAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int checkAcc = scanner.nextInt();
                    Bank acc = bankSystem.searchByAccountNumber(checkAcc);
                    if (acc != null) acc.displayAccountDetails();
                    break;

                case 5:
                    System.out.print("Enter Account Number to Search: ");
                    int searchAcc = scanner.nextInt();
                    bankSystem.searchByAccountNumber(searchAcc);
                    break;

                case 6:
                    System.out.print("Enter Account Number to Close: ");
                    int closeAcc = scanner.nextInt();
                    bankSystem.closeAccount(closeAcc);
                    break;

                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
