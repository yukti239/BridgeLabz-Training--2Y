import java.util.*;

public class TemperatureConverter {
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        String type = sc.next();
        if (type.equalsIgnoreCase("C")) {
            System.out.println("Fahrenheit: " + toFahrenheit(temp));
        } else {
            System.out.println("Celsius: " + toCelsius(temp));
        }
    }
}