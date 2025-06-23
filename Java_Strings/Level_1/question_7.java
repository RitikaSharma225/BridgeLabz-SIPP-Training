import java.util.Scanner;

public class question_7 {

    
    public static void generateException(String text) {
        
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a value: ");
        String input = scanner.next();

        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception in generateException(): " + e.getMessage());
        }

        handleException(input);

        scanner.close();
    }
}
