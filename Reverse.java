import java.util.*;
public class Reverse {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Input a number : ");
            int n = sc.nextInt();
            int i = 0;
            while(n>0) {
                i = i*10 + n%10;
                n /= 10;
            }
            System.out.println(i);
        }
    }
}
