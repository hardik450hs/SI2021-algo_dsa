import java.util.Arrays;
import java.util.Scanner;

/**
 * A_Puzzles
 */
public class A_Puzzles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[]=new int[m];
        for(int i=0; i<m;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        // int i=0;
        // int j=n-1;
        int min =1000;
        for(int x = 0;x<m-(n-1);x++){
            int i=x;
            int j=x+n-1;
            if(min>a[j]-a[i]){
                min = a[j]-a[i];
            }
            
        }
        System.out.println(min);
        sc.close();
    }
}