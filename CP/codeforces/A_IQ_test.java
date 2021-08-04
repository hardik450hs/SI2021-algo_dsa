import java.util.Scanner;

/**
 * A_IQ_test
 */
public class A_IQ_test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int ei=0;
        int oi = 0;
        int co = 0;
        int ce = 0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                ce++;
                ei=i;
            }
            else if(a[i]%2!=0){
                co++;
                oi=i;
            }
            if(ce>1 && co==1){
                System.out.println((oi+1));
                break;
            }
            else if(co>1 && ce==1){
                System.out.println((ei+1));
                break;
            }
        }
    }
}