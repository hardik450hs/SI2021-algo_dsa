import java.util.Scanner;

/**
 * Maximum_Possible_Sweetness
 */
public class Maximum_Possible_Sweetness {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=0;
        if(sc.hasNextInt()){
            t=sc.nextInt();
        }
        while(t>0){
           int n = sc.nextInt();
           int d = sc.nextInt();
           int p[]=new int[n];
           int s[]=new int[n];
           for(int i = 0;i<n;i++){
               p[i]=sc.nextInt();
           }
            
           for(int i = 0;i<n;i++){
                s[i]=sc.nextInt();
           }
           
           int sum =d;
           int sweet = s[0];
        //    int i=0;
        //    int j=n-1;
        //    while()
           for(int i=0;i<n;i++){
               for(int j=i+1;j<n;j++){
                   if(sum<0 )break;
                   if(sweet < s[i]+s[j] && p[i]+p[j] <=d){
                       sweet =s[i]+s[j];
                   }
               }
           }
           System.out.println(sweet);
            t--;
        }
        sc.close();
    }
}