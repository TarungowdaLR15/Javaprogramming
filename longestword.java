
import java.util.Scanner;

public class longestword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String longest = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest word = " + longest);
        System.out.println("Length = " + longest.length());

        sc.close();
    }
}
