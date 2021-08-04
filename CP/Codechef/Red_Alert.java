import java.util.Scanner;

/**
 * Red_Alert
 */
public class Red_Alert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if(sc.hasNextLine())
        t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int h = sc.nextInt();
            int a[]= new int[n];

            for(int i=0;i<n;i++){
                a[i] =sc.nextInt();

            }

            long sum = 0;
            boolean b = false;
            for(int i=0;i<n;i++){
                if(a[i]>0) sum+=a[i];
                else if(a[i]==0){
                    sum=Math.max(0, sum-d);

                }
                if(sum>h){
                    b = true;
                    break;
                }
            }
            if(b==true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }

        sc.close();
    }
}