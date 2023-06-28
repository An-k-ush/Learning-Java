import java.util.*;
public class Kadane_Algo {
    public static int max_sum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int curr_sum = 0;
        int temp = 0;
        int max_2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > temp) {
                temp = arr[i];
            }    
            max_2 = Integer.max(max_2, arr[i]);
        }
        if(temp == 0) {
            return max_2;
        }
        for(int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            if(curr_sum < 0) {
                curr_sum = 0;
            }
            max = Integer.max(max, curr_sum);
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
            int Sum = max_sum(arr);
            System.out.print("The Max sum is " + Sum);
        }
    }    
}
