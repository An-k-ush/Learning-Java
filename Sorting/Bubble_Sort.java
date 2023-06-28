import java.util.*;
public class Bubble_Sort {
    public static void bub_sort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int temp = 0;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i< arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            bub_sort(arr);
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}