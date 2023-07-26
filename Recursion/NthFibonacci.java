public class NthFibonacci {
    public static int fb(int n) {
        if(n==0){
            return 0;
        }
        if(n==2 || n ==1) {
            return 1;
        }
        int rq = fb(n-1) + fb(n-2);
        return rq;
    }
    public static void main(String args[]) {
        int n = 6;
        System.out.print(fb(n));
    }
}
