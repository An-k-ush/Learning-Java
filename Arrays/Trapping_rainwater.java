import java.util.*;
public class Trapping_rainwater {
    public static int trapped(int arr[]) {
        int total = 0;
        for(int i = 1; i < arr.length - 1; i++) {
            int rainl = 0;
            int trap = 0;
            for(int j = i - 1; j >= 0; j--) {
                rainl = Integer.max(rainl, arr[j]);
            }
            int rainr = 0;
            for(int j = i + 1; j < arr.length; j++) {
                rainr = Integer.max(rainr, arr[j]);
            }
            if(rainl <= arr[i] || rainr <= arr[i]) {
                trap = 0;
            }
            else {
                trap = Integer.min(rainr, rainl);
                trap = trap - arr[i];
                total += trap;
            }
        }
        return total;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print(trapped(arr));
        }
    }    
}
