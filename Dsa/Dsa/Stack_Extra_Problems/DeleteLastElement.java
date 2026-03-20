import java.util.*;

public class DeleteLastElement {

    static void deleteLast(Stack<Integer> st) {
        if (st.size() == 1) {
            st.pop();
            return;
        }
        int temp = st.pop();
        deleteLast(st);
        st.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        deleteLast(st);

        while (!st.isEmpty())
            System.out.print(st.pop() + " ");
    }
}
