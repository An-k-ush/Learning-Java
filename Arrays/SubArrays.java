import java.util.*;
public class SubArrays {
    public static void subarr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(i == j) {
                    System.out.println(arr[i] + " ");
                }
                else {
                    for(int k = i; k <= j; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of the array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            subarr(arr);
        }
    }
}
