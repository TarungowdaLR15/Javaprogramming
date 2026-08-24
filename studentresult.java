import java.util.Scanner;

public class studentresult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;

        boolean pass = sub1 >= 40 && sub2 >= 40 && sub3 >= 40;

        boolean distinction = pass && average >= 75;


        boolean specialAward = pass && average >= 90;


        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Student Name : " + name);
        System.out.println("Subject 1   : " + sub1);
        System.out.println("Subject 2   : " + sub2);
        System.out.println("Subject 3   : " + sub3);
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average);

        if (pass)
            System.out.println("Pass/Fail   : PASS");
        else
            System.out.println("Pass/Fail   : FAIL");

        if (distinction)
            System.out.println("Distinction : YES");
        else
            System.out.println("Distinction : NO");

        if (specialAward)
            System.out.println("Special Award: YES");
        else
            System.out.println("Special Award: NO");

        sc.close();
    }
}