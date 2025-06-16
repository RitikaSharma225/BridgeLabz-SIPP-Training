import java.util.*;
public class question_14 {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");  
        int b = sc.nextInt();
        int c=b;
        b=a;
        a=c;
        System.out.println("The swapped numbers are " +a+ " and " +b);
        
    }
}
