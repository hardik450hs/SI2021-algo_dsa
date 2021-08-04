import java.util.Scanner;

/**
 * A_Devu_the_Singer_and_Churu_the_Joker
 */
public class A_Devu_the_Singer_and_Churu_the_Joker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int t[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            t[i]=sc.nextInt();
            sum=sum+t[i];
        }
        int gap = (n-1)*10;
        
        if(sum+gap>d){
            System.out.println(-1);
        }
        else System.out.println((d-sum)/5);
        sc.close();
    }
}