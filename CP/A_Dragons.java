import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;


/**
 * A_Dragons
 */
public class A_Dragons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        Map<Integer,Integer> l = new Map<>(); 
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        boolean ans = true;

        for(int i = 0;i<n;i++){
            if(s>x[i]){
                s=s+y[i];
            }
            else{
                ans =false;
                break;
            }
        }
        if(ans==false) System.out.println("NO");
        else System.out.println("YES");
    }
}