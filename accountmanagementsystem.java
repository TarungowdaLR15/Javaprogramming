import java.util.Scanner;

public class accountmanagementsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        String accountNumber = "";
        String accountHolder = "";
        double balance = 0.0;
        boolean isAccountCreated = false;

        System.out.println("=== WELCOME TO THE BANK MANAGEMENT SYSTEM ===");

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    accountHolder = scanner.nextLine();
                    
                    System.out.print("Enter 12-digit Account Number: ");
                    String tempNumber = scanner.next();
                    
                    if (tempNumber.length() == 12) {
                        accountNumber = tempNumber;
                        balance = 0.0; // Starting balance
                        isAccountCreated = true;
                        System.out.println("Account created successfully!");
                    } else {
                        System.out.println("Error: Account number must be exactly 12 digits long.");
                    }
                    break;

                case 2:
                    if (!isAccountCreated) {
                        System.out.println("Error: Please create an account first (Option 1).");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Successfully deposited: $" + depositAmount);
                    } else {
                        System.out.println("Invalid amount. Deposit must be greater than 0.");
                    }
                    break;

                case 3:
                    if (!isAccountCreated) {
                        System.out.println("Error: Please create an account first (Option 1).");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Error: Insufficient funds. Your balance is $" + balance);
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount. Withdrawal must be greater than 0.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrew: $" + withdrawAmount);
                    }
                    break;

                case 4:
                    if (!isAccountCreated) {
                        System.out.println("Error: Please create an account first (Option 1).");
                        break;
                    }
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 5:
                    if (!isAccountCreated) {
                        System.out.println("Error: No account details found. Create an account first.");
                        break;
                    }
                    System.out.println("--- Account Details ---");
                    System.out.println("Account Holder: " + accountHolder);
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("Current Balance: $" + balance);
                    break;

                case 6:
                    System.out.println("Thank you for using our banking system. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }
}
