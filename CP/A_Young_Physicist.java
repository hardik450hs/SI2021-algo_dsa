import java.util.Scanner;

/**
 * A_Young_Physicist
 */
public class A_Young_Physicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        int z[] = new int[n];
        for(int i =0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            z[i] = sc.nextInt();
        }
        boolean ans =true;
        for(int i =1;i<n;i++){
            x[i]=x[i]+x[i-1];
            y[i]=y[i]+y[i-1];
            z[i]=z[i]+z[i-1];
        }
        if(x[n-1]!=0 || y[n-1]!=0 || z[n-1]!=0){
            ans = false;
        }
        if(ans) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}