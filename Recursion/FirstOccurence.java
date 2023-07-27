public class FirstOccurence {
    public static int occur2(int arr[], int key, int n) {
        if(n == arr.length - 1) {
            if(arr[n] == key) {
                return n;
            }
            else {
                return -1;
            }
        }
        if(arr[n] == key) {
            return n;
        }
        return occur2(arr, key, n+1);
    }
    public static int occur(int arr[], int key) {
        int n = 0;
        return occur2(arr, key, n);
    }
    public static void main(String args[]) {
        int arr[] = {4,5,3,6,7,5,3,1,9,4,7};
        int key = 1;
        System.out.print(occur(arr, key));
    }
}
