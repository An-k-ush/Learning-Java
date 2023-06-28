import java.util.*;
public class Binary_Search {
    public static int Binary(int arr[],int key) {
        int low  = 0;
        int max = arr.length - 1;
        while(low <= max) {
            int mid = (low+max)/2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] > key) {
                max = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the key you want to find : ");
        int key = sc.nextInt();
        int arr[] = {4, 64, 573, 768, 990};
        int result = Binary(arr, key);
        
        if(result == -1) {
            System.out.print("No Key found");
        }
        else {
            System.out.print("The Key is " + result);
        }
        }
    }
}
