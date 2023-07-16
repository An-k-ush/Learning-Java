public class String_Comparison {
    public static void main(String args[]) {
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");
        if(str1 == str2) {
            System.out.println("They are same");
        }
        else {
            System.out.println("Not Equal");
        }
        if(str1 == str3) {                         // str3 is not equal to str 1 cause they are not stored in the same. We made a new string with the new keyword
            System.out.println("They are same"); // whereas str1 and str2 are equal cause they point towards the same string i.e "Tony"
        }
        else {
            System.out.println("Not Equal");
        }
        // To compare the value of a string we use .equals() it returns a boolean value.
        if(str1.equals(str3)) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("they are not equal");
        }
    }
}
