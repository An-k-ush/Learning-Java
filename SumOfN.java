import java.util.*;
public class SumOfN {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            int Counter = 1;
            System.out.print("Enter a Number n : ");
            int n = sc.nextInt();
            int sum = 0;
            while(Counter<=n) {
                sum += Counter;
                Counter++;
            }
            System.out.println(sum);
        }
    }
}