import java.util.Scanner;

public class ShortLongWordDemo {
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
        String temp = "";
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                list.add(temp);
                temp = "";
            } else {
                temp += c;
            }
        }
        list.add(temp);
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String shortest = words[0], longest = words[0];

        for (String w : words) {
            if (customLength(w) < customLength(shortest)) shortest = w;
            if (customLength(w) > customLength(longest)) longest = w;
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
