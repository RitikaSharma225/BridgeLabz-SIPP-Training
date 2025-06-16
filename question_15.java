import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class question_15 {
    public static void main(String[] args) {
        System.out.print("enter weight : ");
        Scanner sc = new Scanner(System.in);
        int weightinpounds = sc.nextInt();
        double weightinkilograms = weightinpounds * 0.45359237;
        System.out.print("The weight of the person in pounds is " + weightinpounds+ " and in kg is "+weightinkilograms);


       
    }
}
