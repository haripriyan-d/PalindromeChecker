/**
 * UseCase5PalindromeCheckerApp
 *
 * This class demonstrates palindrome checking using
 * a Stack data structure (LIFO principle).
 *
 * @author Student
 * @version 1.0
 */

import java.util.Stack;

public class PalindromeChecker {

    /**
     * Main method – Entry point of the Java application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push characters of the string into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Build reversed string by popping from stack
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}