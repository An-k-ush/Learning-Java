import java.util.*;
public class reverse {
    public static void rev(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while(first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the keys of array : ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            rev(arr);
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] +" ");
            }
        }
    }
}
