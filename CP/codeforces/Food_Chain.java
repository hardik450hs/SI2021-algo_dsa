import java.util.Scanner;

/**
 * Food_Chain
 */
public class Food_Chain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=0;
        if(sc.hasNextInt()){
            t=sc.nextInt();
        }
        while(t>0){
            int e=sc.nextInt();
            int k=sc.nextInt();
            int c =1;
            while (e/k>0){
                c++;e=e/k;
            }
            System.out.println(c);
            t--;
        }
        sc.close();
    }
}