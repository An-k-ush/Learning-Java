public class LastOccurence {
    public static int lastoccur(int arr[], int key,int i, int n) {
        if(i == arr.length-1) {
            if(arr[i] == key) {
                n = i;
                return n;
            }
            else {
                return n;
            }
        }
        if(arr[i]== key) {
            n = i;
            return lastoccur(arr, key, i+1, n);
        }
        return lastoccur(arr, key, i+1, n);
    }
    public static void main(String args[]) {
        int arr[] = {4,8,2,8,0,1,9,3,6,8,3,4,9,7,8,0};
        System.out.print(lastoccur(arr, 10,0, -1));
    }    
}
