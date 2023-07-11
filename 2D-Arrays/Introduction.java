import java.util.*;
public class Introduction {
    public static void main(String args[]) { 
        try(Scanner sc = new Scanner(System.in)) {
            int arr2d[][] = new int[2][3];
            // arr2d[2][2] = 3;   
            // System.out.print(arr2d[2][2]); 
            System.out.println(arr2d.length); // THis will give no of rows.
            System.out.print("Enter the elements of 2d array : ");
            for(int i = 0; i < arr2d.length; i++) {
                for(int j = 0; j < arr2d[0].length; j++) {
                    arr2d[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < arr2d.length; i++) {
                for(int j = 0; j < arr2d[0].length; j++) {
                    System.out.print(arr2d[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}