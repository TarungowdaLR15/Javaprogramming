
import java.util.Scanner;

public class firstnonrepeating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = '\0';

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                result = ch;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeated character = " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }

        sc.close();
    }
}
