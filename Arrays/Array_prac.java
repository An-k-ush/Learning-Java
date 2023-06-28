import java.util.*;
public class Array_prac {
    public static void update(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            update(arr);
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
        }
    }
}
