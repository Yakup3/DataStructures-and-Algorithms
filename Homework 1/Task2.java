//-----------------------------------------------------
// Title: Queue tester class
// Author: Yakupguly/Malikov
// Section: 1
// Assignment: 1
// Description: This class tests the given string is a good string and good value
//-----------------------------------------------------

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static boolean isGoodString(int[] arr) {

        // returns false if arr contains 0
        // 0 means, it is not good string yet because there is at least one character left
        for (int k : arr) {
            if (k == 0) {
                return false;
            }
        }

        // returns true because all english alphabet is in substring(arr)
        return true;
    }

    public static void main(String[] args) {

        Tester2 tester2 = new Tester2();

        // getting number of Strings from Tester2 class
        int n = tester2.getNumberOfStrings();

        // getting strings from Tester2 class
        String[] list = tester2.getStrings();

        for (int t = 0; t < n; t++) {

            String s = list[t];

            int[] arr = new int[26];

            int j = 0;
            int result = 0;

            boolean goodString;

            Queue<Character> queue = new Queue<>();

            for (int i = 0; i < s.length(); i++) {

                // checks if the substring is good string in order not to enter while loop
                goodString = isGoodString(arr);

                // if not good string then it enters while loop and evaluates string
                while (!goodString && j < s.length()) {

                    char c = s.charAt(j);

                    // it increases the index of each character
                    // 97 is ascii value of 'a'
                    // if the character in the index j is 'a' then arr[0] is increased by one if 'b' then arr[1] is
                    // increased by one.
                    arr[c - 97]++;

                    queue.enqueue(c);

                    // checks in each iteration if the substring is good string
                    goodString = isGoodString(arr);

                    j++;

                    // if good string then substring after this is also good string
                    if (goodString) {
                        break;
                    }
                }

                // if good string is true then removes the first character and adds number of substring to result
                if (goodString) {

                    char c = queue.dequeue();

                    // this calculates when we find good string then, if add any character to it, it is also good string
                    result += s.length() - j + 1;
                    arr[c - 97]--;
                }
            }

            // printing the result
            System.out.printf("Parsing string #%d:\n", t + 1);
            System.out.println(result);

        }
    }

}
