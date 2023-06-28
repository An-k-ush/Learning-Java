import java.util.*;
public class Function_parameters {
    public static void sum(int a, int b) {
        System.out.println("The Sum is " + (a+b));
        return;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number : ");
            int a = sc.nextInt();
            System.out.print("Enter the Second number : ");
            int b = sc.nextInt();
            sum(a, b);
        }
    }
}
