import java.util.Scanner;

/**
 * Shoe_Fit
 */
public class Shoe_Fit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            int b= sc.nextInt();
            int c=sc.nextInt();

            if((a==0 && b==0 && c==0) || (a==1 && b==1 && c==1))
                System.out.println(0);
            else System.out.println(1);

            t--;
        }
        sc.close();
    }
}