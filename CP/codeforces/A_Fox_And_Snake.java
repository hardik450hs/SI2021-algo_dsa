import java.util.Scanner;

/**
 * A_Fox_And_Snake
 */
public class A_Fox_And_Snake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char m[][] = new char[r][c];
        boolean t = false;
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    m[i][j] = '#';
                }
            } else {
                if (t == false) {
                    for (int j = 0; j < c; j++) {

                        if (j == c - 1) {
                            m[i][j] = '#';
                        } else
                            m[i][j] = '.';

                    }
                    t = true;
                } else {
                    for (int j = 0; j < c; j++) {
                        if (j == 0) {
                            m[i][j] = '#';
                        } else
                            m[i][j] = '.';

                    }
                    t = false;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}