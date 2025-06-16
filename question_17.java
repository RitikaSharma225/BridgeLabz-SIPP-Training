import java.util.*;
public class question_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter temperature in celcius: " );
        double tempInCelcius = sc.nextDouble();
        double tempInFahrenheit = (tempInCelcius * 9/5) + 32;
        System.out.println("The temperature in Celcius is " + tempInCelcius + " and in Fahrenheit is " + tempInFahrenheit);
    }
    
}
