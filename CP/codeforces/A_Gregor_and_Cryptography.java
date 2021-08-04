import java.util.Scanner;

/**
 * A_Gregor_and_Cryptography
 */
public class A_Gregor_and_Cryptography {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            System.out.println(2 +" " +(n-1));
            t--;
        }

        sc.close();
        
    }
}