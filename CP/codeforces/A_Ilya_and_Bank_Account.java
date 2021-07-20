import java.util.Scanner;

/**
 * A_Ilya_and_Bank_Account
 */
public class A_Ilya_and_Bank_Account {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n>=0) System.out.println(n);
        else{
            long d1 = n%10;
            
            System.out.println(Math.max((n/10),((n/100))*10+d1));
        }

        sc.close();
    }
}