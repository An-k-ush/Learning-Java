public class Palindrome {
    public static boolean checkpal2(String str, int n) {
        if(n == str.length()/2 + 1) {
            if(str.charAt(n-1) == str.charAt(str.length() - (n-1) - 1)) {
                return true;
            }
            else {
                return false;
            }
        }
        if(str.charAt(n-1) != str.charAt(str.length() - (n-1) - 1)) {
            return false;
        }
        return checkpal2(str, n-1);
    }
    public static boolean checkpal(String str) {
        return checkpal2(str, str.length());
    }
    public static void main(String args[]) {
        String str = "racecar";
        System.out.print(checkpal(str));
    }    
}
