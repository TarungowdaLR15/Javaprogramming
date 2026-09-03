import java.util.Scanner;

public class Studentbank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 0.0;
        boolean running = true;
        
        System.out.println("Welcome to the Student Bank!");
        
        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + balance);
                    break;
                    
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Successfully deposited $" + depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrew $" + withdrawAmount);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Error: Not enough balance!");
                    } else {
                        System.out.println("Invalid withdrawal amount!");
                    }
                    break;
                    
                case 4:
                    running = false;
                    System.out.println("Thank you for using Student Bank. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please choose between 1 and 4.");
            }
        }
        
        scanner.close();
    }
}
