
import java.util.Scanner;

public class stringanagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            sc.close();
            return;
        }

        boolean anagram = true;

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == ch) {
                    count1++;
                }

                if (str2.charAt(j) == ch) {
                    count2++;
                }
            }

            if (count1 != count2) {
                anagram = false;
                break;
            }
        }

        if (anagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        sc.close();
    }
}
