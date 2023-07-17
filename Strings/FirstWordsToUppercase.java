public class FirstWordsToUppercase {
    public static String cap(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length(); i++) {
            if(i == 0) {
                char ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else if(str.charAt(i) == ' ' && i < str.length() - 1) { 
                char ch = Character.toUpperCase(str.charAt(i+1));
                sb.append(str.charAt(i));
                sb.append(ch);
                i++;
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        str = sb.toString();
        return str;
    }
    public static void main(String args[]) {
        String str = "my name is cruz";
        String newstr = cap(str);
        System.out.print(newstr);
    }
}
