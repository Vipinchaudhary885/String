package Strings;

public class Palindrome {
    public static void main(String[] args) {

        // In palindrome case, if we can have any String object reverse or forward
        // direction are same after reversing or forwarding any String result will same
        // these types of String are called as Palindrome.
        // ex --> madam,nitin,5225 and so on. after reversing or forwarding result will
        // remains same .

        String str1 = "madam";
        String str2 = "";

        // for reversing logic .
        for (int i=str1.length()-1; i>=0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equals(str2)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not a Palindrome");
        }
    }
}
