package Strings;

public class StringDeclaration {
    public static void main(String[] args) {
        // method 1
        String brand = "pw";
        System.out.println(brand);

        // method 2
        String brand1 = new String("pw");
        System.out.println(brand1);

        // Heap vs String Constant Pool(SCP) .

        // In heap, duplicates are allowed but in String Constant Pool are not allowed .
        // String costant pool is a region inside the heap area memory but before string
        // constant pool is
        // region inside the method area .
        // In String "==" is work as comparision .

        // without new operator/keyword, it's stored in String constant pool.
        String s1 = "pw";
        String s2 = "pw";
        System.out.println(s1 == s2); // true

        // with new keyword, it is stored that inside the heap area memory b/c it's
        // allow to store duplicate value of same type of string object .
        String s3 = new String("pw skill");
        String s4 = new String("pw skill");
        System.out.println(s3 == s4); // false
    }
}
