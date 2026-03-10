/**
 * UseCase3PalindromeCheckerApp
 *
 * This class demonstrates how to check whether a string
 * is a palindrome by reversing it using a for loop.
 *
 * @author Student
 * @version 1.0
 */
public class PalindromeChecker {

    /**
     * Main method – Entry point of the Java application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using a loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed strings
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}