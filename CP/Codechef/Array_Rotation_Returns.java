import java.util.Scanner;

/**
 * Array_Rotation_Returns
 */
public class Array_Rotation_Returns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 0;
        if(sc.hasNextLine())
        t = sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int c[]=new int[n];
            for(int i =0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i =0;i<n;i++){
                b[i]=sc.nextInt();
            }
            for(int i =0;i<n;i++){
                c[i]=(a[0]+b[i])%n;
            }
            for(int i =0;i<n;i++){
                System.out.print(c[i] +" ");
            }
            int min=0;
            for(int i =1;i<n;i++){
                if(c[i]<c[i-1]) min = i;
            }
            System.out.println(min);
            t--;
        }
    }
}