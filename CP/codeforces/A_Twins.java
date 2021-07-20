import java.util.*;

/**
 * A_Twins
 */
public class A_Twins {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        int sum =0;
        for(int i = 0; i<n;i++){
            a[i]=s.nextInt();
            sum = sum+a[i];
        }
        int half = sum/2;
        int s1=0;
        int c=0;
        Arrays.sort(a);
        for(int i = n-1 ;i>=0;i--){
            s1=s1+a[i];
            c++;
            if(half<s1) break;
        }
        
        System.out.println(c);

        s.close();
    }
}