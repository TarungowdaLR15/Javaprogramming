import java.util.Scanner;
public class PrintStudentinfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        System.out.print("Enter student cgpa: ");
        String cgpa = sc.next();
        System.out.println(".....Student Information:.....");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        sc.close();
    }
}
