public class StringCompression {
    public static void compress(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder("");
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)) {
                count++;
            }
            else {
                sb.append(str.charAt(i-1));
                if(count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
            if(i == str.length() - 1) {
                sb.append(str.charAt(i));
                if(count > 1) {
                    sb.append(count);
                }
            }
            
        }
        System.out.print(sb);
    }
    public static void main(String args[]) {
        String str = "aabbbbcddee";
        compress(str);
    }
}
