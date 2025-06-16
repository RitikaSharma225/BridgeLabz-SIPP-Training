import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class question_9 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter the first number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int b;
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
        int q=a/b;
        int r=a%b;
        System.out.println("The Quotient is " +q+" and Reminder is " +r+ " of two number " +a+ " and " +b);

    }
}
