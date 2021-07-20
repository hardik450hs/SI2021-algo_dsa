import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A_Games
 */
public class A_Games {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h[] = new int[n];
        int a[] = new int[n];
        for(int i= 0;i<n;i++){
            h[i] =s.nextInt();
            a[i]=s.nextInt();
        }
        int count=0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(h[i]==a[j]) count++;
            }
        }
        System.out.println(count);
        s.close();
    }
}