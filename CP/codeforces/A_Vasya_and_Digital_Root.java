import java.util.Scanner;

/**
 * A_Vasya_and_Digital_Root
 */
public class A_Vasya_and_Digital_Root {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextInt();
        if(n>1 && k==0)System.out.println("No solution");
        
        else{
            System.out.print(k);
            for(int i=0;i<n-1;i++){
                System.out.print(0);
            }
        }
    }
}