public class SumofN {
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        int total = 0;
        total = n + sum(n-1);
        return total;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.print(sum(n));
    }
}
