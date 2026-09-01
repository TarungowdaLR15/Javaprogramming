import java.util.Scanner;
public class removeduplicateinintegerarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int[] uniqueArray = removeDuplicates(array);
        
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    public static int[] removeDuplicates(int[] array) {
        return java.util.Arrays.stream(array).distinct().toArray();
    }
}