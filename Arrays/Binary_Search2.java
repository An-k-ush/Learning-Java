import java.util.*;
public class Binary_Search2 {
    public static int bin(int arr[], int n){
        int min = 0;
        int max = arr.length - 1;
        while(min <= max) {
            int mid = (min + max)/2;
            if(arr[mid] > n) {
                max = mid - 1;
            }
            else if(arr[mid] < n) {
                min = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)) {
            int arr[] = {1,2,3,4,5};
            System.out.print("Enter the Key you want to find : ");
            int n = sc.nextInt();
            int result = bin(arr, n);
            if(result == -1) {
                System.out.print("Key not Found");
            }
            else {
                System.out.print("The key is at "+result);
            }
        }
    }
}
