import java.util.*;
public class Calculator {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the First Operand : ");
            int a = sc.nextInt();
            System.out.print("Enter the Second Operand : ");
            int b = sc.nextInt();
            System.out.print("Enter the Operator like +, -, /, *, %, ^ : ");
            String Operator = sc.next();
            switch(Operator) {
                case "+" :System.out.println("Answer is = " + (a+b));
                    break;
                case "-" :System.out.println("Answer is = " + (a-b));
                    break;
                case "/" :System.out.println("Answer is = " + (a/b));
                    break;
                case "*" :System.out.println("Answer is = " + (a*b));
                    break;
                case "%" :System.out.println("Answer is = " + (a%b));
                    break;
                case "^" :System.out.println("Answer is = " + (a^b));
                    break;
                default: System.out.println("L Bozo");
            }

        }
    }


    
    
}
