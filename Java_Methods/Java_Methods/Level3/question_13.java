import java.util.*;

public class question_13 {

    public static int[][] generateMarks(int students) {
        int[][] scores = new int[students][3];
        Random random = new Random();
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(61) + 40; // range: 40 to 100
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // total, average, percentage
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.printf("%-5s %-8s %-10s %-8s %-8s %-10s %-10s %-8s\n", "ID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-8d %-10d %-8d %-8.0f %-10.2f %-10.2f %-8s\n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    getGrade(results[i][2]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateMarks(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);

        sc.close();
    }
}
