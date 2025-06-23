import java.util.*;

public class question_1 {

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string:");
        String input1 = scanner.next();

        System.out.print("Enter second string:");
        String input2 = scanner.next();
      
        boolean resultCharAt = compareStrings(input1, input2);

        boolean resultEquals = input1.equals(input2);

        System.out.println("Result from charAt() method: " + resultCharAt);
        System.out.println("Result from equals() method: " + resultEquals);

    }
}