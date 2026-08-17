import java.util.Scanner;
public class PrintMultiplenames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names to enter: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name  " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.println("Name " + (i + 1) + ": " + name);
        }
        sc.close();
    }
}
