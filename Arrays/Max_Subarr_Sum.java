import java.util.*;
public class Max_Subarr_Sum {
    public static int max_sub_sum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j <= arr.length; j++) {
                int temp = 0;
                for(int k = i; k < j; k++) {
                    temp += arr[k];
                }
                max = Integer.max(max, temp);
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
            int max_sum = max_sub_sum(arr);
            System.out.print("The Max Sum = " + max_sum);
        }
    }
}