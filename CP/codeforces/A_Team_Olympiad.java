import java.util.Scanner;

/**
 * A_Team_Olympiad
 */
public class A_Team_Olympiad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int ans = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for(int i=0;i<n;i++){
            if(a[i]==1)c1++;
            else if(a[i]==2)c2++;
            else c3++;
        }
        int r1=0,r2=0,r3=0;
        boolean f1=false,f2=false,f3=false;
        ans=Math.min(c1, Math.min(c2, c3));
        if(ans==0)System.out.println(ans);
        else{
            System.out.println(ans);
            for(int i =0;i<ans;i++){
                for(int j=0;j<n;j++){
                    if(a[j]==1 && f1==false){
                        r1=j+1;
                        a[j]=0;
                        f1=true;
                    }
                    else if(a[j]==2 && f2==false){
                        r2=j+1;
                        a[j]=0;
                        f2=true;
                    }
                    else if(a[j]==3 && f3== false){
                        r3=j+1;
                        a[j]=0;
                        f3=true;
                    }
                }
                System.out.println(r1 +" " +r2 +" " +r3);
                f1=false;
                f2=false;
                f3=false;
                
            }
        }
    }
}