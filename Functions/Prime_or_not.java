import java.util.*;
public class Prime_or_not {
    public static void prime(int n) {
        int i;
        for(i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) {
                System.out.println("The Number is not Prime");
                break;
            }
        }
        if(i == n) {
            System.out.print("The number is prime");
        }
        return;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            prime(n);
        }
    }
}
