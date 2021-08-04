import java.util.Scanner;

/**
 * Three_Dices
 */
public class Three_Dices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
        t = sc.nextInt();
        while(t>0){
            double x=sc.nextInt();
            double y=sc.nextInt();
            if(x+y>=6.0)
                System.out.println(0);
            else{
            double ans = (6-(x+y))/6;
            
                ans = Math.floor(ans*1000000.0)/1000000.0;
                System.out.println(ans);
            }
            t--;
    }
}
}