import java.util.*;

public class UniqueCharacters {
    public static int lengthOfString(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static char[] findUnique(String s) {
        int len = lengthOfString(s);
        char[] result = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[index++] = c;
        }
        return Arrays.copyOf(result, index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] unique = findUnique(s);
        for (char c : unique) System.out.print(c + " ");
    }
}