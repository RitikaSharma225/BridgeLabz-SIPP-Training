import java.util.*;
public class question_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter salary: ");
        int salary=sc.nextInt();
        System.out.print("enter bonus: ");
        int bonus=sc.nextInt();
        int income=salary+bonus;
        System.out.println("The salary is INR " + salary+" and the bonus is INR " +bonus+ " Hence Total Income is INR " +income);
    }
    
}
