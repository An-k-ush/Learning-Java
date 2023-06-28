import java.util.*;
public class Buy_Sell_Stocks {
    public static void find(int arr[]) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > buy) {
                int temp = arr[i] - buy;
                profit = Math.max(profit, temp);
            }
            else {
                buy = arr[i];
            }
        }
        System.out.print(profit);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            find(arr);
        }
    }
}
