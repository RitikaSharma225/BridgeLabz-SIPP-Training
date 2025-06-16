import java.util.*;
public class question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();  
        double c= sc.nextDouble();
        double p=a + b *c;
        double q=a * b + c;
        double r=c + a / b;
        double s=a % b + c;
        System.out.println("the results of Double Operations are" +p+ q+ "and"+r);

        
        
        }
    }
    
