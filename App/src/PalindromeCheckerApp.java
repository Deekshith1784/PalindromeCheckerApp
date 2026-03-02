import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Stack-Based Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert input to lowercase to make it case-insensitive
        String normalizedInput = input.toLowerCase();

        // Create a stack of characters
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (int i = 0; i < normalizedInput.length(); i++) {
            stack.push(normalizedInput.charAt(i));
        }

        // Pop characters to build reversed string
        String reversedString = "";
        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        // Compare original and reversed strings
        if (normalizedInput.equals(reversedString)) {
            System.out.println("Result: The given string is a palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}