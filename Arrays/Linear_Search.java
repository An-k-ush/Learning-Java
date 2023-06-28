import java.util.*;
public class Linear_Search{
    public static int search(int arr[], int key) { 
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            System.out.print("Enter the keys of array : ");
            int arr[] = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the key you want to search : ");
            int key = sc.nextInt();
            int result = search(arr, key);
            if(result == -1) {
                System.out.print("Key doesnt exist");
            }
            else{
                System.out.print("Key is at : "+ result);
            }
        }
    }
}