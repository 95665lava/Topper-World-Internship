import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    balance = withdrawMoney(balance, scanner);
                    break;

                case 2:
                    balance = depositMoney(balance, scanner);
                    break;

                case 3:
                    checkBalance(balance);
                    break;

                case 4:
                    exitATM();
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    // Function to display the ATM menu
    private static void displayMenu() {
        System.out.println("ATM Machine");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Choose the operation: ");
    }

    // Function to withdraw money
    private static int withdrawMoney(int balance, Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();

        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("Please collect your money");
        } else {
            System.out.println("Insufficient Balance");
        }

        return balance;
    }

    // Function to deposit money
    private static int depositMoney(int balance, Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        int depositAmount = scanner.nextInt();

        balance += depositAmount;
        System.out.println("Your money has been successfully deposited");

        return balance;
    }

    // Function to check the account balance
    private static void checkBalance(int balance) {
        System.out.println("Balance: " + balance);
    }

    // Function to exit the ATM
    private static void exitATM() {
        System.out.println("Thank you for using the ATM. Goodbye!");
        System.exit(0);
    }
}
