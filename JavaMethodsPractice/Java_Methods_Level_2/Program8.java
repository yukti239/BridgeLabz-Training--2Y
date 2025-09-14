import java.util.Scanner;
public class Program8 {
    public static int findYoungest(int[] ages) {
        int min = ages[0], idx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < min) { min = ages[i]; idx = i; }
        return idx;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0], idx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > max) { max = heights[i]; idx = i; }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) heights[i] = sc.nextInt();
        int y = findYoungest(ages);
        int t = findTallest(heights);
        System.out.println("Youngest: Friend " + (y + 1));
        System.out.println("Tallest: Friend " + (t + 1));
    }
}