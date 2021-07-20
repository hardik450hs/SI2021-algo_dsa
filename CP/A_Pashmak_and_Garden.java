import java.util.Scanner;

/**
 * A_Pashmak_and_Garden
 */
public class A_Pashmak_and_Garden {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3,y3,x4,y4;
        int dx = Math.abs(x1-x2);
        int dy = Math.abs(y1-y2);
        if(dx==dy){
            x3 = x1;
            y3 = y2;
            x4 = x2;
            y4 = y1;
        }
        else if(x1 == x2){
            x3 = x1 + dy;
            y3 = y1;
            x4 = x2 +dy;
            y4 = y2;
        }
        else if(y1 == y2){
            x3 = x1;
            y3 = y1 +dx;
            x4 = x2;
            y4  =y2 +dx;
        }
        else{
            System.out.println(-1);
            return;
        }
        System.out.print(x3 +" " +y3 +" "+x4 +" " +y4);
        sc.close();
    }
}