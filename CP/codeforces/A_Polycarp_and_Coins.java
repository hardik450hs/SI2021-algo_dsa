import java.util.Scanner;

/**
 * A_Polycarp_and_Coins
 */
public class A_Polycarp_and_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int k=sc.nextInt();
            int c1=0;
            int c2=0;
            if(k%3==0){
                c1=k/3;
                c2=k/3;
            }
            else if(((k/3)+1)*1+(k/3)*2==k){
                c1=(k/3)+1;
                c2=k/3;
            }
            else if((k/3)*1+((k/3)+1)*2==k){
                c1=k/3;
                c2=(k/3)+1;
            }
            System.out.println(c1 +" " +c2);
            n--;
        }
    }
}