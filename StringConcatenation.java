package Strings;

public class StringConcatenation {
    public static void main(String[] args) {

        // In string concatenation(that means to add something), there are two types of
        // string concatenation in java .
        // + method or concat() method .

        // String s1 = new String("pw");
        // s1 = s1.concat("skill");
        // System.out.println(s1);

        // String s1 = "pw";
        // String s2 = s1.concat("skill");
        // String s3 = new String("pwjava");
        // s3 = s3.concat("skill");

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        // String s1 = "pw";
        // String s2 = "pw" + "skill";
        // String s3 = "pw" + "java" + "skill";
        // String s4 = s1 + s2;
        // String str = "pw" + 100 + 99;

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(str);

        // with concat() method .
        String s1 = "pw";
        String s2 = "java";
        String s3 = s1.concat("java").concat("skill");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2.length()); // 4
        System.out.println(s2.toUpperCase()); // JAVA
        System.out.println(s2.indexOf("a")); // 1
        System.out.println(s2.lastIndexOf("a")); // 3

        // + operator .
        String s4 = "pw" + "skill";
        String s5 = "pw" + "java" + "skill";
        System.out.println(s4);
        System.out.println(s5);

    }
}
