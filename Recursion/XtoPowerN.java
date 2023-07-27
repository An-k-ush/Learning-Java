public class XtoPowerN {
    public static int raiseto(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * raiseto(x, n-1);
    }
    public static void main(String args[]) {
        int x = 2;
        int n = 5;
        System.out.print(raiseto(x, n));
    }
}
