/**
 * UseCase2PalindromeCheckerApp
 *
 * This class demonstrates checking whether a hardcoded string
 * is a palindrome and printing the result to the console.
 *
 * @author Student
 * @version 1.0
 */
public class PalindromeChecker {

    /**
     * Main method – Entry point of the Java application.
     * The JVM invokes this method when the program starts.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if the string is a palindrome
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}