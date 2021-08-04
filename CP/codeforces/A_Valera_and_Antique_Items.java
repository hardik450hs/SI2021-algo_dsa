import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * A_Valera_and_Antique_Items
 */
public class A_Valera_and_Antique_Items {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int count=0;
        boolean flag = false;
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
            int s=sc.nextInt();
            for(int j = 0;j<s;j++){
                int sp=sc.nextInt();
                if(sp<v && flag==false){
                    ans[count]=i+1;
                    flag =true;
                    count++;
                }   
                
            }
            flag=false;
        }
        System.out.println(count);
        for(int i=0;i<count;i++){
            System.out.print(ans[i] +" ");
        }
    }
}