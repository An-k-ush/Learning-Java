import java.util.*;
public class Basics {
    public static void main(String args[]) {   // String is a inbuilt class in Java
        String str = "My name is Alex";   //Written in double quotes.
        String last_name = "Murphey";
        String introduction = str + " " + last_name;  // String Concatenation
        System.out.println(introduction);
        try(Scanner sc = new Scanner(System.in)) {
//          String name = sc.next(); //  Only take First word of the Entered String
//          System.out.println(name);
            String full_name = sc.nextLine(); //Take full string
            System.out.print(full_name);
        }
    }
}
