import java.util.*;

public class BMIProgram {
    public static String[][] calculateBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double height = hw[i][1] / 100;
            double bmi = weight / (height * height);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal";
            else if (bmi < 29.9) status = "Overweight";
            else status = "Obese";
            result[i][0] = String.valueOf(height * 100);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    public static void display(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n","Height(cm)","Weight(kg)","BMI","Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            hw[i][0] = sc.nextDouble();
            hw[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMI(hw);
        display(result);
    }
}