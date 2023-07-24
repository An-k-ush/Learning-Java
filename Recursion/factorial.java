public class factorial {
    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        int total = 0;
        total = n * fact(n-1);
        return total;
    }
    public static void main(String args[]) {
        int n = 10;
        System.out.print(fact(n));
    }
}
