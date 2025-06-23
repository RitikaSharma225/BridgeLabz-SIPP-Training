import java.util.Scanner;

public class question_3 {

    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.next();

        char[] customChars = getCharacters(input);

        char[] builtinChars = input.toCharArray();

        boolean isEqual = compareCharArrays(customChars, builtinChars);

        System.out.print("Custom char array: ");
        for (char ch : customChars) {
            System.out.print(ch + " ");
        }

        System.out.print("\nBuilt-in char array: ");
        for (char ch : builtinChars) {
            System.out.print(ch + " ");
        }

        System.out.println("\nAre both arrays equal? " + isEqual);

        scanner.close();
    }
}

