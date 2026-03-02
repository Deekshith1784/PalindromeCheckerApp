import java.util.Scanner;

import java.util.Scanner;
import java.util.Stack;

// Service class that handles palindrome logic
class PalindromeChecker {

    // Public method exposed to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize input (case-insensitive)
        String normalized = input.toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        // Compare characters
        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("=== Object-Oriented Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}