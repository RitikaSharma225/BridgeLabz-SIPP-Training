import java.util.Scanner;

public class question_2 {

    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String manualSub = manualSubstring(text, start, end);

        String builtinSub = "";
        if (start >= 0 && end <= text.length()) {
            builtinSub = text.substring(start, end);
        }

        boolean isSame = compareUsingCharAt(manualSub, builtinSub);

        System.out.println("\nManual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtinSub);
        System.out.println("Are both substrings equal? " + isSame);

    }
}

