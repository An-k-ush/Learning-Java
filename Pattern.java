import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
/*          System.out.print("Input a number : ");
            int n = sc.nextInt();
            for(int i = 1; i<=n; i++) {
                for(int j = 1; j<=n; j++) {
                    System.out.print("*  ");                 SQUARE PATTERN
                }
                System.out.println();
            }*/

            // System.out.print("Input a number : ");
            // int n = sc.nextInt();
            // for(int i = 1; i<=n; i++) {
            //     for(int j = 1; j<=i; j++) {
            //         System.out.print("* ");               STAIR STAR PATTERN
            //     }
            //     System.out.println();
            // }


            // System.out.print("Input a number : ");
            // int n = sc.nextInt();
            // for(int i = n; i>=1; i--) {
            //     for(int j = 1; j<=i; j++) {
            //         System.out.print("*  ");              INVERTED STAR PATTERN
            //     }
            //     System.out.println();
            // }



            // System.out.print("Input a number : ");
            // int n = sc.nextInt();
            // char ch = 'A';
            // for(int i = 1; i<=n; i++) {
            //     for(int j = 1; j<=i; j++) {
            //         System.out.print(ch);                 CHARACTER STAIR PATTERN
            //         ch = (char)(ch + 1);
            //     }
            //     System.out.println();
            // }
            

            // System.out.print("Input a number : ");
            // int n = sc.nextInt();
            // for(int i = n; i>=1; i--) {
            //     int num = 1;
            //     for(int j = 1; j<=i; j++) {
            //         System.out.print(num + " ");          INVERTED STAIR CHARACTER PATTERN
            //         num ++;
            //     }
            //     System.out.println();
            // }

            // System.out.print("Input a number : ");
            // int n = sc.nextInt();
            // for(int i = 1; i<=n; i++) {
            //     for(int j = 1; j<=2*n; j++) {
            //         if(j<=i || j>2*n-i) {
            //             System.out.print("*");
            //         }
            //         else {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();                           BUTTERFLY PATTERN
            // }

            // for(int i = n; i >= 1; i--) {
            //     for(int j = 1; j <= 2*n; j++) {
            //         if(j <= i || j> 2*n-i){
            //             System.out.print("*");
            //         }
            //         else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }



            // System.out.print("Input a Number : ");
            // int n = sc.nextInt();
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= 2*n; j++) {
            //         if(j > n-i && j < 2*n+1-i) {
            //             System.out.print("*");
            //         }
            //         else {
            //             System.out.print(" ");                      RHOMBUS PATTERN
            //         }
            //     }
            //     System.out.println();
            // }

            
            System.out.print("Input a number : ");
            int n = sc.nextInt();
            for(int i = 1; i<=n; i++) {
                for(int j = 1; j <= 2*n+1; j++) {
                    if(j > n+1-i && j < n+1+i) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int i = 1; i <= 2*n+1; i++) {
                System.out.print("*");                           //  DIAMOND PATTERN
            }
            System.out.println();
             for(int i = n; i >= 1; i--){ 
                 for(int j = 1; j <= 2*n+1; j++) {
                     if(j > n+1-i && j < n+1+i) {
                         System.out.print("*");
                     }
                     else {
                         System.out.print(" ");
                     }
                 }
                 System.out.println();
             }













        }
    }
}
