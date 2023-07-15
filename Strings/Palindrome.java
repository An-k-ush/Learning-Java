public class Palindrome {
    public static boolean palind(String str) {
        str = str.toLowerCase();
        for(int i = 0 ; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String pal = "RAcecar";
        if(palind(pal)) {
            System.out.print("Yes it is a palindrome");
        }
        else {
            System.out.print("It is not a Palindrome");
        }
    }
    
}
