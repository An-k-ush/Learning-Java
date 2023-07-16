public class Substring {
    public static void substr(String str, int start, int end) {
        String a = "";
        for(int i = start; i < end; i ++) {
            a = a + str.charAt(i);
        }
        System.out.print(a);
    }
    public static void main(String args[]) {
        String str = "Hello World";
        str.substring(0, 4);
    }
}
