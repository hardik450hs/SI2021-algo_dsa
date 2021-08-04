import java.util.Scanner;

/**
 * Chef_and_Spells
 */
public class Chef_and_Spells {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if(sc.hasNextLine())
        t= sc.nextInt();
        while(t>0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long ans = Math.min(a, b);
            ans = Math.min(ans, c);
            ans = a+b+c-ans;
            System.out.println(ans);
            t--;
        }
        sc.close();
        }
}