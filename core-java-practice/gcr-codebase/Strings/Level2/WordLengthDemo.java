import java.util.Scanner;

public class WordLengthDemo {
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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
