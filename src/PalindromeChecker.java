/**
 * UseCase4PalindromeCheckerApp
 *
 * This class demonstrates how to check whether a string
 * is a palindrome using a character array and the
 * two-pointer technique.
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

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}