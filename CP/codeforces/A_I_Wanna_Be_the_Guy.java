import java.util.HashSet;
import java.util.Scanner;

/**
 * A_I_Wanna_Be_the_Guy
 */
public class A_I_Wanna_Be_the_Guy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h[]=new int[n+1];
        // h[n+1]=0;
        boolean ans = true;
        int p = sc.nextInt();
        for(int i = 0;i<=n;i++){
            h[i]=0;
        }
        for(int i = 0;i < p ; i++){
            int k=sc.nextInt();
            h[k]=1;
        }
        int q = sc.nextInt();
        for(int i = 0;i<q;i++){
            int k=sc.nextInt();
            h[k]=1;
        }
        for(int i =1;i<=n;i++){
           if(h[i]!=1){
            ans = false;
            break;
           }
        }
        
        if(ans) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");

    }
}