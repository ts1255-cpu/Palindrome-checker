public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "Reviver";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println("Word: " + word);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
} 