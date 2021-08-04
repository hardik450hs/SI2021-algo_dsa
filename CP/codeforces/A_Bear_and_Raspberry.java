import java.util.Scanner;

/**
 * A_Bear_and_Raspberry
 */
public class A_Bear_and_Raspberry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int diff=0;
        for(int i=1;i<n;i++){
            if(diff<a[i-1]-a[i] && a[i-1]-a[i]>0) diff=a[i-1]-a[i];
        }
        if(diff-c<0 )System.out.println(0);
        else System.out.println(diff-c);
    }
}