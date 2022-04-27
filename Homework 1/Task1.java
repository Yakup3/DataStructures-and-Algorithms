//-----------------------------------------------------
// Title: Stack tester class
// Author: Yakupguly/Malikov
// Section: 1
// Assignment: 1
// Description: This class tests the given expression is in well formed
//-----------------------------------------------------

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Tester1 tester1 = new Tester1();

        // getting number of expressions from Tester1 class
        int n = tester1.getNumberOfExpressions();

        // getting expressions from Tester1 class
        String[] list = tester1.getExpressions();

        for (int i = 0; i < n; i++) {

            String s = list[i]; // * new

            // to remove whitespace
            s = s.replaceAll(" ", "");

            Stack<Character> brackets = new Stack<>();
            Stack<Integer> index = new Stack<>();

            boolean wellFormed = true;
            boolean contains = false;

            // this is the characters that valid expression should contain
            String valid = "[]{}()1234567890+-*/";

            // to check if input contains other than operators, bracket types, integers
            for (int c = 0; c < s.length(); c++) {
                String character = s.charAt(c) + "";

                // checks if valid string contains character
                if (!valid.contains(character)) {
                    contains = true;
                    break;
                }
            }

            System.out.printf("Parsing expression #%d:\n", i+1);

            // runs if string does not contain other than operators, bracket types and integer
            if (!contains) {
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);

                    if (c == '[' || c == '{' || c == '(') {
                        // pushing brackets to stack
                        brackets.push(c);
                        // pushing indexes in order to print between two brackets
                        index.push(j);
                    } else if (c == ']' || c == '}' || c == ')') {

                        // if bracket stack is empty then it means it is not well formed
                        if (brackets.isEmpty()) {
                            System.out.println("Given expression is not well formed.");
                            wellFormed = false;
                            break;
                        }

                        // check if opening and closing brackets match
                        char poppedChar = brackets.pop();
                        if (poppedChar == '[' && c != ']') {
                            wellFormed = false;
                            break;
                        } else if (poppedChar == '(' && c != ')') {
                            wellFormed = false;
                            break;
                        } else if (poppedChar == '{' && c != '}') {
                            wellFormed = false;
                            break;
                        }

                        // popping starting index of substring from indexes stack
                        int beginning = index.pop();
                        System.out.println(beginning + "," + j + "," + s.substring(beginning, j + 1));
                    }
                }

                if (!brackets.isEmpty() && !wellFormed) {
                    System.out.println("Given expression is not well formed.");
                } else if (wellFormed) {
                    System.out.println("Given expression is well formed.");
                }
            }else {
                // prints if the format is invalid
                System.out.println("Invalid Parse");
            }
        }
    }
}
