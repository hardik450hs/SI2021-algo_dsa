import java.util.Scanner;

/**
 * A_Dubstep
 */
public class A_Dubstep {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int n = st.length();
        int space = 0;
        for (int i = 0; i < n; i++) {
            if ( i <n-2 && st.charAt(i) == 'W' && st.charAt(i + 1) == 'U' && st.charAt(i + 2) == 'B') {
                if (space == 1) {
                    System.out.print(" ");
                    space = 0;
                }
                i=i+2;
                continue;
            }
            else {
                System.out.print(st.charAt(i));
                space=1;
            }

        }
    }
}