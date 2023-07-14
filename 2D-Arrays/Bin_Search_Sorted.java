public class Bin_Search_Sorted {
    public static Boolean search(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >=0) {
            if(key == arr[row][col]) {
                return true;
            }
            else if( key < arr[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int arr[][] = {{13,14,20,27,35},
                       {14,20,25,30,40},
                       {22,33,44,55,66}};
        if(search(arr, 13)){
            System.out.print("The Key is Present");
        }
        else {
            System.out.print("The Key is not Present");
        }
    }
}
