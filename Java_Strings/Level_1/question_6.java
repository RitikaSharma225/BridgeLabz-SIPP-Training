import java.util.Scanner;

public class question_6 {

    public static void generateException(String text) {
        System.out.println("Substring (10, 5): " + text.substring(10, 5));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Substring (10, 5): " + text.substring(10, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception in generateException(): " + e.getMessage());
        }

        handleException(input);

        scanner.close();
    }
}

