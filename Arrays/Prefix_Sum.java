import java.util.*;
public class Prefix_Sum {
    public static int max_sum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int prefix_arr[] = new int[arr.length];
        prefix_arr[0] = arr[0];
        for(int i = 1; i < prefix_arr.length; i++) {
            prefix_arr[i] = prefix_arr[i-1] + arr[i]; 
        }
        for(int i = 0; i < arr.length; i++) {
            int curr_sum = 0;
            for(int j = i; j < arr.length; j++) {
                if(i == 0) {
                    curr_sum = prefix_arr[j];
                }
                else {
                    curr_sum = prefix_arr[j] - prefix_arr[i-1];
                }
                if(curr_sum > max) {
                    max = curr_sum;
                }
            }
        }
        return max;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the keys of array : ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = max_sum(arr);
            System.out.print("The max sum is " + sum);
        }
    }
}
