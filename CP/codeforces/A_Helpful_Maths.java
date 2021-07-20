import java.util.Scanner;

/**
 * A_Helpful_Maths
 */
public class A_Helpful_Maths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = new String();
        st = sc.nextLine();
        String ans = new String();
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < st.length(); i += 2) {
            if (st.charAt(i) == '1')
                c1++;
            if (st.charAt(i) == '2')
                c2++;
            if (st.charAt(i) == '3')
                c3++;
        }
       
        for (int i = 0; i < st.length(); i += 2) {
            if (c1 > 0) {
                if (i == st.length() - 1)
                    ans = ans + '1';
                else {
                    ans = ans + '1' + '+';
                    c1--;
                }
                continue;
            } else if (c2 > 0 && c1 == 0) {
                if (i == st.length() - 1)
                    ans = ans + '2';
                else {
                    ans = ans + '2' + '+';
                    c2--;
                }
                continue;
            } else if (c3 > 0 && c1 == 0 && c2 == 0) {
                if (i == st.length() - 1)
                    ans = ans + '3';
                else {
                    ans = ans + '3' + '+';
                    c3--;
                }
                continue;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}