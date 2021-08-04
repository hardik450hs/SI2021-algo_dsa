import java.util.Arrays;
import java.util.Scanner;

/**
 * Longest_Good_Segment
 */
public class Longest_Good_Segment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 0;
        if(sc.hasNextLine())
        t = sc.nextInt();
        while(t>0){
            int k = sc.nextInt();
            int n = sc.nextInt();
            long s = sc.nextLong();
            long a[] = new long[k];
            for(int i =0;i<k;i++){
                a[i]=sc.nextLong();
            }
            int b[] = new int[k];
            long sum=a[0];
            int c=1;

            for(int i=0;i<k;i++){
                sum=sum+a[i];
                if(s>=sum){ 
                    b[i] = c++;
                    
                }
                else{
                    c=1;
                    sum=0;
                    i--;
                }

            }
            
            sum=0;
            Arrays.sort(b);
            
            for(int i=k-1;i>k-n-1;i--){
                sum=sum+b[i];
            }
            System.out.println(sum);
            t--;
        }
    }
}