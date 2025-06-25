import java.util.Random;
import java.util.Arrays;

public class question_1 {

    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }

        return heights;
    }

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);
        System.out.println("Heights of players (in cm): " + Arrays.toString(heights));

        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean);
    }
}
