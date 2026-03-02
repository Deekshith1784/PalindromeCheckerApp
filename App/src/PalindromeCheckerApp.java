import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome using two-pointer approach
    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Case-Insensitive & Space-Ignored Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string:
        // 1. Convert to lowercase
        // 2. Remove all spaces using regular expression
        String normalizedInput = input.toLowerCase().replaceAll("\\s+", "");

        boolean result = isPalindrome(normalizedInput);

        if (result) {
            System.out.println("Result: The given string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}