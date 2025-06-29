import java.util.Scanner;

public class question_3 {
    public static boolean isLeapYear(int year) {
        return (year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
