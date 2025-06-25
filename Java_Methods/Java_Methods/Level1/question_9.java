import java.util.Scanner;

public class question_9 {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int[] result = new int[2];
        result[0] = chocolates / children;
        result[1] = chocolates % children;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
