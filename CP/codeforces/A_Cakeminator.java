import java.util.Scanner;

/**
 * A_Cakeminator
 */
public class A_Cakeminator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c  =sc.nextInt();
        char m[][] = new char[r][c];
        for(int i=0;i<r;i++){
            m[i] = sc.next().toCharArray();
        }
    }
}