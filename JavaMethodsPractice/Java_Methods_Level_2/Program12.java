import java.util.*;
public class Program12 {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{(double)sum/numbers.length, min, max};
    }
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] res = findAverageMinMax(arr);
        System.out.println("Numbers: " + Arrays.toString(arr));
        System.out.println("Average: " + res[0] + " Min: " + res[1] + " Max: " + res[2]);
    }
}