import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class question_10 {
    public static void main(String[] args) {
        System.out.print("enter unit price: ");
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        System.out.print("enter quantity: ");
        int q = sc.nextInt();
        int total = up * q;
        System.out.print("The total purchase price is INR " + total + " if the quantity is " + q + " and the unit price is INR " + up);
    }
}
