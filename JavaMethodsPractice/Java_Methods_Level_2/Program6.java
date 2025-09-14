public class Program6 {
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        System.out.println(convertFarhenheitToCelsius(98.6));
        System.out.println(convertCelsiusToFarhenheit(37));
        System.out.println(convertPoundsToKilograms(100));
        System.out.println(convertKilogramsToPounds(50));
        System.out.println(convertGallonsToLiters(5));
        System.out.println(convertLitersToGallons(10));
    }
}