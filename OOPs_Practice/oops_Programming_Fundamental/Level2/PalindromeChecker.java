package Level2;

public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        return cleaned.equals(sb.reverse().toString());
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is palindrome: " + isPalindrome());
        System.out.println();
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        PalindromeChecker p2 = new PalindromeChecker("Hello");
        p1.displayResult();
        p2.displayResult();
    }
}
