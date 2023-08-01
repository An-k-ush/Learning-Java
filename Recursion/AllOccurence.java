public class AllOccurence {
    public static void find2(int arr[], int key, int i) {
        if(i == arr.length - 1) {
            if(arr[i] == key) {
                System.out.print(i+" ");
                return;
            }
            else {
                return;
            }
        }
        if(arr[i] == key) {
            System.out.print(i+" ");
        }
        find2(arr, key, i+1);
        return;
    }
    public static void find(int arr[], int key) {
        find2(arr, key, 0);
        return;
    }
    public static void main(String args[]) {
        int arr[] = {3, 5, 1, 7, 2, 7, 0, 4, 8, 1, 5, 7};
        find(arr, 7);
    }
} 