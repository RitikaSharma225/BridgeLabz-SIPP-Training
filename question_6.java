import java.util.Scanner;
public class question_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        int feet = height / 12;
        int inches = height % 12;
        System.out.println("Your Height in cm is " +height+ " while in feet is " +feet +" and inches is " +inches);
    }
}
