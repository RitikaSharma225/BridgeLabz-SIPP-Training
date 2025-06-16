import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = sc.next();
        int result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Cannot divide by zero");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                sc.close();
                return;
        }
        System.out.println("The result is: " + result);
    }
}
