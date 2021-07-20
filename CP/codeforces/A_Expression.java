

import java.util.Scanner;

/**
 * A_Expression
 */
public class A_Expression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int x[]=new int[6];
        x[0]=a+b+c;
        x[1]=a*b*c;
        x[2]=(a+b)*c;
        x[3]=a*(b+c);
        //x[4]=(a+c)*b;
        x[4]=a*b+c;
        x[5]=a+b*c;
        //x[7]=a*c+b;
        int max = x[0];
        for(int i = 1;i<6;i++){
            if(max<x[i]) max=x[i];
        }
        
        
        System.out.println(max);

        sc.close();
    }
}