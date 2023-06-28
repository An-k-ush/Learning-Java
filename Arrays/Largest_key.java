import java.util.*;
public class Largest_key {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n]; 
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < arr.length; i++) {
                max = Integer.max(max, arr[i]);
                min = Integer.min(min, arr[i]);
            }
            System.out.print("The largest key is "+ max +"\nThe smallest key is " + min);
        }
    }
}
