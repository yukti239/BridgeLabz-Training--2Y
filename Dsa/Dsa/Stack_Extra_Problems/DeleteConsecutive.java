import java.util.*;

public class DeleteConsecutive {

    static void removeConsecutive(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int x : arr) {
            if (!st.isEmpty() && st.peek() == x)
                st.pop();
            else
                st.push(x);
        }

        System.out.println(st);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        removeConsecutive(arr);
    }
}
