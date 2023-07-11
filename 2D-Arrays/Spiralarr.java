public class Spiralarr {
    public static void spiral(int arr[][]) {
        int start_row = 0;
        int start_col = 0;
        int end_row = arr.length - 1;
        int end_col = arr[0].length - 1;
        while(start_row <= end_row && start_col <= end_col) {
            for(int j = start_col; j <= end_col; j++) {
                System.out.print(arr[start_row][j] + " ");
            }
            start_row++;
            for(int j = start_row; j <= end_row; j++) {
                System.out.print(arr[j][end_col] + " ");
            }
            end_col--;
            for(int j = end_col; j >= start_col; j--) {
                if(start_row > end_row) {
                    break;
                }
                System.out.print(arr[end_row][j] + " ");
            }
            end_row--;
            for(int j = end_row; j >= start_row; j--) {
                if(start_col > end_col) {
                    break;
                }
                System.out.print(arr[j][start_col] + " ");
            }
            start_col++;

        }
    } 
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {13, 14, 15, 16},
                       {9, 10, 11, 12},
                       {17, 18, 19, 20}};
        spiral(arr);
    }    
}
