import java.util.*;

public class Conditionals {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a Number = ");
        int x = sc.nextInt();
        if(x>=50) {
            System.out.println("Your Number is greate than 50");
        }
        else{
            System.out.println("Bozo L Ratio");
        }
        }

    }
}