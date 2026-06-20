import java.util.Scanner;

public class SplitWordsDemo {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] customSplit(String text) {
        int len = customLength(text);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        String temp = "";
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = temp;
                temp = "";
            } else {
                temp += c;
            }
        }
        words[wordIndex] = temp;
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Comparison result: " + compareArrays(custom, builtIn));
    }
}
