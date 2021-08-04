import java.util.*;

/**
 * Chef_and_GCD
 */
public class Chef_and_GCD {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=0;
        if(sc.hasNextInt())
        t=sc.nextInt();
        while(t>0){
            long a=sc.nextLong();
            long b= sc.nextLong();
            if(a%2==0 && b%2==0) System.out.println(0);
            else if(((a+1)%2==0 && b%2==0) || (a%2==0 && (b+1)%2==0)) System.out.println(1);
            else System.out.println(2);
            
            t--;
        }
        sc.close();
    }
}