import java.util.Scanner;

/**
 * A_Way_Too_Long_Words
 */
public class A_Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        //String st = new String();
        while (t > 0) {
            String st = new String();
            st = s.next();
            int n = st.length();
            if (n > 10)
            System.out.println(st.charAt(0) +"" +(n-2) +""+st.charAt(n-1));
            else
            System.out.println(st);
            t--;
        }
        s.close();
    }
}