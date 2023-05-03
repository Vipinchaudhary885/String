package Strings;

public class Pangram {
    public static void main(String[] args) {
        // In pangram String, all alphabet are present i.e. a to z or A to Z and these
        // type of String are called as pangram.

        boolean flag = false;
        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        str = str.replace(" ", "");
        char[] ch = str.toCharArray();

        int[] arr = new int[26]; // corresponding array .

        // for loop for char array and change value of int array i.e. 0 --> 1 or 1 --> 2
        // that means value incresed during time but non-zero.
        // we can use for uppercase minus 65 i.e. -65 .
        // we can use for lowercase minus 97 i.e. -97.

        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 65]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("It is not pangram");
                flag = true;
            }
        }
       if (flag == false) {
            System.out.println("It is a pangram");
        } 
    }
}
