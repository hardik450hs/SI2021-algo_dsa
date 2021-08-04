import java.util.Scanner;

/**
 * Cricket_Ranking
 */
public class Cricket_Ranking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
        t = sc.nextInt();
        while(t>0){
            int s[]=new int[2];
            int r[]=new int[2];
            int w[]=new int[2];
            int c[]=new int[2];
            for(int i=0;i<2;i++){
                r[i]=sc.nextInt();
                w[i] =sc.nextInt();
                c[i] = sc.nextInt();
                s[i]=0;

            }
            if(r[0]>r[1]) s[0]++; else s[1]++;
            if(w[0]>w[1])s[0]++; else s[1]++;
            if(c[0]>c[1]) s[0]++; else s[1]++;
            if(s[0]>s[1]) System.out.println("A");
            else System.out.println("B");
            t--;
        }
        sc.close();
    }
}