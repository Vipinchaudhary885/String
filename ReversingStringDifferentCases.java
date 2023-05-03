package Strings;

public class ReversingStringDifferentCases {
    public static void main(String[] args) {

        // Concept of reverse string different cases .
        // String str1 = "pwjava"; // directly stored in the String Constant Pool it's a
        // part of Heap Area.
        // String str2 = "";

        // for (int i = str1.length() - 1; i >= 0; i--) {

        // str2 = str2 + str1.charAt(i);
        // }
        // System.out.println("Before reversing " + str1);
        // System.out.println("After reversing " + str2);

        // String str1 = "pwskill java"; // directly stored in the String Constant Pool
        // it's a part of Heap Area.
        // String str2 = "";

        // for (int i = str1.length() - 1; i >= 0; i--) {

        // str2 = str2 + str1.charAt(i);
        // }
        // System.out.println("Before reversing " + str1);
        // System.out.println("After reversing " + str2);

        // Interexchange the value pwskill java i.e. java pwskill .
        // String str1 = "pwskill java"; // directly stored in the String Constant Pool
        // it's a part of Heap Area.
        // String str2 = ""; // empty String .
        // String[] arr = str1.split(" ");
        // for (int i = arr.length - 1; i >= 0; i--) {

        // str2 = str2 + arr[i] + " ";
        // }
        // System.out.println("Before interexchange " + str1);
        // System.out.println("After interexchange " + str2);

        // Changes on reserved/preserved location .
        // pwskill java i.e. llikswp avaj
        String str1 = "pwskill java"; // directly stored in the String Constant Pool it's a part of Heap Area.
        String str2 = ""; // empty String .
        String[] arr = str1.split(" ");

        // enhanced for loop .
        for (String elem : arr) {

            // reversing string logic .
            for (int i = elem.length() - 1; i >= 0; i--) {

                str2 = str2 + elem.charAt(i);
            }
            str2 = str2 + " ";
        }

        System.out.println("Before interexchange " + str1);
        System.out.println("After interexchange " + str2);

    }
}
