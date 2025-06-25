import java.util.Scanner;
public class question_3 {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;
        return (int) Math.ceil(rounds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds to complete 5 km: " + rounds);
    }
}
