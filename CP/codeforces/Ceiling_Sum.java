import java.util.Scanner;

/**
 * Ceiling_Sum
 */
public class Ceiling_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=0;
        if(sc.hasNextInt()){
            t=sc.nextInt();
        }
        while(t>0){
            double a=sc.nextInt();
            double b=sc.nextInt();
            if(a==b)System.out.println(0);
            else if((a+b)%2==0 && a!=b){
                int ans =(int)Math.ceil((b-a+1)/2);
                System.out.println(ans);
            }
            else{
                int ans =(int)Math.ceil((b-a)/2);
                System.out.println(ans);
            }
            
            t--;
        }
        sc.close();
    }
}