import java.util.Scanner;

/**
 * A_PizzaForces
 */
public class A_PizzaForces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            long ans=0;
            if(n<=6) ans = 15;
            else{
                if(n%2!=0) n++;
                ans = (n*5)/2;
            }
            
            System.out.println(ans);
            

            t--;
        }

        sc.close();
    }
}