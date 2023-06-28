import java.util.*;
public class Arrays_Basic {
    public static void main(String args[]) {
      //  int arr[] = new int[50];
        // OR
        try(Scanner sc = new Scanner(System.in)) {
        int arr1[] = {1, 2, 3, 4};
        for(int i = 0; i<4; i++) {
            System.out.println(arr1[i]);
        }
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int arr2[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter a number : ");
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++) {
            System.out.println(arr2[i]);
        }
        }
    }
}