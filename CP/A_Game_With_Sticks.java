import java.util.Scanner;

/**
 * A_Game_With_Sticks
 */
public class A_Game_With_Sticks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int a=0;
        if(m>n){
            a=n;
        }
        else a=m;
        if(a%2==0)System.out.println("Malvika");
        else System.out.println("Akshat");

    
    }
}