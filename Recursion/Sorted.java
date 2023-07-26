public class Sorted {
    public static boolean sort(int arr[], int n) {
        if(n == 2) {
            if(arr[1] >= arr[0]) {
                return true;
            }
            else{
                return false;
            }
        }
        if(arr[n-1] < arr[n-2]){
            return false;
        }
        return sort(arr, n - 1);
    }
    public static void main(String args[]) {
        int arr[] = {1,1,2,3,5,6};
        if(sort(arr, arr.length)) {
            System.out.print("Yes it is sorted");
        }
        else {
            System.out.print("Not Sorted");
        }
    }
}
