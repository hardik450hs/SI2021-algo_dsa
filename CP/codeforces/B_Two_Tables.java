import java.util.Scanner;

/**
 * B_Two_Tables
 */

//half
public class B_Two_Tables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long W = sc.nextLong();
            long H = sc.nextLong();
            long x1 = sc.nextLong();
            long y1 = sc.nextLong();
            long x2=sc.nextLong();
            long y2 = sc.nextLong();
            long w=sc.nextLong();
            long h = sc.nextLong();
            int x=0;
            int y=0;
            float ans = 0;

            if(W < Math.abs(x1-x2) + w && H < Math.abs(y1-y2)+h) System.out.println(-1);
            else{
                if(w<=x1-0 || w<=W-x2 || h<=y1-0 || h<=H-y2) System.out.println(0.0000000000);
                else{
                    if(W >= Math.abs(x1-x2) + w){

                    }
                    System.out.println(1);
                }
            }

            t--;
    
        }
        sc.close();
    }

}