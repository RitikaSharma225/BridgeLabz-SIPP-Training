import java.util.Random;

public class question_11 {

    public static double[][] generateSalaryAndService(int n) {
        double[][] data = new double[n][2];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = 1 + rand.nextInt(10);
        }

        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        int n = data.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = salary + bonus;
        }

        return result;
    }

    public static void displayTable(double[][] serviceData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s %-10s %-15s %-15s %-15s\n", "Emp No", "Service", "Old Salary", "Bonus", "New Salary");

        for (int i = 0; i < serviceData.length; i++) {
            System.out.printf("%-10d %-10.0f %-15.2f %-15.2f %-15.2f\n",
                    (i + 1),
                    serviceData[i][1],
                    bonusData[i][0],
                    bonusData[i][1],
                    bonusData[i][2]
            );
            totalOldSalary += bonusData[i][0];
            totalBonus += bonusData[i][1];
            totalNewSalary += bonusData[i][2];
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-22s %-15.2f %-15.2f %-15.2f\n", "TOTAL", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int employees = 10;

        double[][] salaryAndService = generateSalaryAndService(employees);
        double[][] bonusAndNewSalary = calculateBonusAndNewSalary(salaryAndService);

        displayTable(salaryAndService, bonusAndNewSalary);
    }
}
