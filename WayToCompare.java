package Strings;

public class WayToCompare {
    public static void main(String[] args) {

        // compare == operator or equals() method .

        // In == operator, it's compares the reference of string object .
        // In equals() method, it's compares the content(i.e. string content) of two
        // object.
        // And both of you define the result inn terms of boolean expression .

        // String s1 = "pw skill";
        // String s2 = new String("pw skill");
        // System.out.println(s1 == s2); // false
        // System.out.println(s1.equals(s2)); // true

        // String s1 = "pwjava";
        // String s2 = "pwjava";
        // String s3 = "pwskill";

        // System.out.println(s1==s2); // true
        // System.out.println(s1==s3); // false
        // System.out.println(s1.equals(s3)); // false
        // System.out.println(s1.equals(s2)); // true

        String s1 = new String("pwjava");
        String s2 = new String("pwjava");
        String s3 = new String("pwjava");
        String s4 = "pwJava";

        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s4)); // true
       

    }
}
