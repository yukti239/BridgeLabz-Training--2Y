public class Program5 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }
    public static void main(String[] args) {
        System.out.println(convertYardsToFeet(10));
        System.out.println(convertFeetToYards(10));
        System.out.println(convertMetersToInches(1));
        System.out.println(convertInchesToMeters(10));
        System.out.println(convertInchesToCm(10));
    }
}