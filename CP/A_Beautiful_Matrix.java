import java.util.Scanner;

/**
 * A_Beautiful_Matrix
 */
public class A_Beautiful_Matrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[][]=new int[6][6];
        int r=1;
        int c=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                a[i][j] = s.nextInt();
                if(a[i][j]>0){
                    r=i;
                    c=j;
                    break;
                }
            }
        }
        int ans = Math.abs((c-3))+Math.abs((r-3));
        System.out.println(ans);
    }
}