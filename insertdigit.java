import java.util.Scanner;
public class insertdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter a digit to insert: ");
        int digit = sc.nextInt();
        System.out.print("Enter the position to insert the digit: ");
        int pos = sc.nextInt();

        String numStr = String.valueOf(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            if (i == pos) {
                result.append(digit);
            }
            result.append(numStr.charAt(i));
        }

        if (pos >= numStr.length()) {
            result.append(digit);
        }

        System.out.println("Result: " + result.toString());
        sc.close();
    }
}
