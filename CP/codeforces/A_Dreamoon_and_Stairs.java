import java.util.Scanner;

/**
 * A_Dreamoon_and_Stairs
 */
public class A_Dreamoon_and_Stairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x=0;
        if(n<m) System.out.println(-1);
        else{
            if(n%2==0){
                x = n/2;
            }
            else{
                x= n/2 +1;
            }
            while(x%m!=0){
                x++;
            }
            System.out.println(x);

        }
    }
}