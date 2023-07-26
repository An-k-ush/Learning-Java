public class Increasing {
    public static void inc(int n) {
        if(n == 1) {
            System.out.print(1 + " ");
            return;
        }
        inc(n-1);
        System.out.print(n + " ");
        return;
    }
    public static void main(String args[]) {
        int n = 5;
        inc(n);
    }
}
