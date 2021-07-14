import java.util.Scanner;

/**
 * A_Arrival_of_the_General
 */
public class A_Arrival_of_the_General {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max=a[0];
        int min=a[0];
        int count = 0;
        int mini=0;
        int maxi=0;

        for(int i = 1;i<n;i++){
            if(min >=a[i] ){
                min = a[i];
                mini=i;
            }
        }
       
       
        for(int i =0;i<n;i++){
            if(max<a[i]){
                max=a[i];
                maxi=i;
            }
        }
        
        if(mini > maxi){
            count = Math.abs(mini-(n-1))+Math.abs(maxi-0);
        }
        else{
            count = Math.abs(mini-(n-1))+Math.abs(maxi-0)-1;
        }

        System.out.println(count);
    }
}