import java.util.Scanner;

/**
 * A_Presents
 */
public class A_Presents {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++){
            int k=s.nextInt();
            a[k]=i;
        }
        for(int i=1;i<=n;i++){
            System.out.print(a[i] +" ");
        }
    }
}