import java.util.Scanner;
public class PrintNameandAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        sc.close();
    }
}
