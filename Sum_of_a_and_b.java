import java.util.*;

public class Sum_of_a_and_b {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Sum = ");
        System.out.println(a+b);


        float r;
        System.out.print("Enter the radius = ");
        r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.print("Area = ");
        System.out.println(area);

        }
    }    
}
