package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        // In Anagram String, we can say if any string object define same type of character
        // element and these types of element are same in given string and it is known
        // as anagram.

        String str1 = "School master";
        String str2 = "The classroom";
        // check these strings are anagram or not .
        // Step 1. Removes the spaces.
        // Step 2. Convert into lowercase or Uppercase.
        // Step 3. Create an char array.
        // Step 4. Arrays sorting.
        // Step 5. last, compare the arrays.

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("It is an Anagram");
        } else {
            System.out.println("It is not an Anagram");
        }

    }
}