import java.util.*;
public class question_5 {

    public static void generateException(String text) {
        
        System.out.println("Character at index 100: " + text.charAt(100));
    }

    
    public static void handleException(String text) {
        try {
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a word: ");
        String input = scanner.next();

        
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception in generateException(): " + e.getMessage());
        }

        handleException(input);

        scanner.close();
    }
}
