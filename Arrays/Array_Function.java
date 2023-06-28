import java.util.*;
public class Array_Function {
    public static void update(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
        System.out.print("Input a Number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        update(arr);
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        }
    }
}
