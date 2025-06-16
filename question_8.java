import java.util.*;
public class question_8 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter distance in feet :");
        int dist=sc.nextInt();
        int yards=dist*1760;
        int miles=dist*5280;
        System.out.println("The distance in yards is "+ yards +" while the distance in miles is "+miles);
        
    }
    
}
