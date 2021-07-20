import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * A_String_Task
 */
public class A_String_Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = new String();
        String st1 = new String();
        st = sc.nextLine();

        for (int i = 0; i < st.length(); i++) {

            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
                    || st.charAt(i) == 'u' || st.charAt(i) == 'y' || st.charAt(i) == 'A' || st.charAt(i) == 'E'
                    || st.charAt(i) == 'I' || st.charAt(i) == 'O' || st.charAt(i) == 'U' || st.charAt(i) == 'Y')
                continue;
            else {
                st1 = st1 + '.';
                st1 = st1 + st.toLowerCase().charAt(i);
            }
        }
        System.out.println(st1);
    }
}