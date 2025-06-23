import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } 
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + "it  a prime number");
        } else {
            System.out.println(num + " it not a prime number");
        }
    }
    
}
