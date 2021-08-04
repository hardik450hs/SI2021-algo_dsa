import java.util.Scanner;

/**
 * Chess_Format
 */
public class Chess_Format {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=0;
        if(sc.hasNextInt()){
            t=sc.nextInt();
        }
        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a+b<3) System.out.println(1);
            else if(a+b>=3 && a+b <= 10) System.out.println(2);
            else if(a+b>=11 && a+b<=60) System.out.println(3);
            else System.out.println(4);

            t--;
        }
        sc.close();
    }
}