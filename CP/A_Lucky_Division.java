import java.util.Scanner;

/**
 * A_Lucky_Division
 */
public class A_Lucky_Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = {4,7,47,74,774,747,477,744,474,447};
        boolean ans = false;
        for(int i=0;i<10;i++){
            if(n%a[i]==0){
                ans=true;
                break;
            }
        }
        if(ans)System.out.println("YES");
        else System.out.println("NO");
    }
}