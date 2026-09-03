
import java.util.Scanner;

public class studentbank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Account Creation
        System.out.println("========== STUDENT BANK SYSTEM ==========");
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        double balance = 0;
        while (true) {
            System.out.print("Enter Initial Deposit: ");
            balance = scanner.nextDouble();
            if (balance > 0) {
                break;
            }
            System.out.println("Initial deposit must be greater than ₹0. Please try again.");
        }

        System.out.println("Account created successfully!\n");

        int choice = 0;

        while (choice != 6) {
            System.out.println("\n========== STUDENT BANK SYSTEM ==========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice! Please enter a number between 1 and 6.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("₹%.2f deposited successfully.\n", depositAmount);
                        System.out.printf("Current Balance: ₹%.2f\n", balance);
                    } else {
                        System.out.println("Deposit amount must be greater than ₹0.");
                    }
                    break;

                case 2:

                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= 0) {
                        System.out.println("Withdrawal amount must be greater than ₹0.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Error: Insufficient balance!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful.");
                        System.out.printf("Current Balance: ₹%.2f\n", balance);
                    }
                    break;

                case 3:

                    System.out.printf("Current Balance: ₹%.2f\n", balance);
                    break;

                case 4:

                    System.out.println("\n--- ACCOUNT DETAILS ---");
                    System.out.println("Student Name: " + studentName);
                    System.out.println("Student ID  : " + studentId);
                    System.out.println("Account No  : " + accountNumber);
                    System.out.printf("Balance     : ₹%.2f\n", balance);
                    break;

                case 5:

                    System.out.print("Enter number of years: ");
                    double years = scanner.nextDouble();
                    if (years < 0) {
                        System.out.println("Number of years cannot be negative.");
                    } else {
                        double annualRate = 5.0;
                        double interest = (balance * annualRate * years) / 100;
                        double totalBalance = balance + interest;
                        System.out.printf("Interest earned at 5%% per annum for %.1f years: ₹%.2f\n", years, interest);
                        System.out.printf("New balance (Balance + Interest): ₹%.2f\n", totalBalance);
                    }
                    break;

                case 6:

                    System.out.println("Thank you for using Student Bank System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select an option from 1 to 6.");
                    break;
            }
        }

        scanner.close();
    }
}
