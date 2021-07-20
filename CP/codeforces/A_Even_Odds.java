import java.util.Scanner;

/**
 * A_Even_Odds
 */
public class A_Even_Odds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n%2!=0){
            if(k==(n/2 + 1 )) System.out.println(n);
            else if(k>(n/2 + 1)) System.out.println(2*(k-(n/2 +1)));
            else System.out.println(2*k -1);
        }
        else{
            if(k==n/2) System.out.println(n-1);
            else if(k>n/2) System.out.println(2*(k-(n/2)));
            else System.out.println(2*k-1);
        }
       
        sc.close();
    }
}