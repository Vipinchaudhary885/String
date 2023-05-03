package Strings;

public class InbuiltMethodsInString {
    public static void main(String[] args) {

        // inbuilt methods in string class .
        // gemerally prefer commonly used method .
        
        String str = "pw skill java";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        // int lenght =str.length(); // for real life development .
        System.out.println(str.substring(3, 8));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
    }
}
