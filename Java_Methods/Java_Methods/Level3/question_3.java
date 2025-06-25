import java.util.Scanner;

public class question_3 {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;

        while (number > 0) {
            digits[index--] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // [digit][0] = digit, [digit][1] = frequency

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);
        int digitCount = countDigits(number);
        int sum = sumOfDigits(digits);
        int sumSquares = sumOfSquares(digits);
        boolean harshad = isHarshad(number, digits);
        int[][] freq = digitFrequency(digits);

        System.out.println("Digit count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumSquares);
        System.out.println("Is Harshad Number? " + harshad);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
            }
        }
    }
}
