public class factorialv2 {
    public static int fact2(int n, int a) {
        if(n <= 0) {
            return a;                                         // Code From GFG Tail Recursion
        }
        return fact2(n-1, n * a);
    }
    public static int fact(int n) {
        return fact2(n, 1);
    }
    public static void main(String args[]) {
        int n = 6;
        System.out.print(fact(n));
    }
}
