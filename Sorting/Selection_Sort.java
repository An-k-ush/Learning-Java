import java.util.*;
public class Selection_Sort {
    public static void select_sort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            select_sort(arr);
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
