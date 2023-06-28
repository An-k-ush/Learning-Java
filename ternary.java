import java.util.*;
public class ternary {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b =sc.nextInt();
            int large = (a>b)? a:b;
            System.out.print(large);
        }
    }    
}
