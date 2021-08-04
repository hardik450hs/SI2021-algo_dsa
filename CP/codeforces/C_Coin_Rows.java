import java.util.Scanner;

/**
 * C_Coin_Rows
 */
public class C_Coin_Rows {
    static int back(int a[][], int sum , int i, int j,int m){
        
        if(j==m-1 && i==1) {
            a[i][j]=0;
            return sum+a[i][j];
        }
        if(i>=2 || j>=m) return 0;

        else{
            Math.max(back(a,sum+a[i][j],i,j++,m),back(a,sum+a[i][j],i++,j,m));

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int m=sc.nextInt();
            int a[][] = new int[2][m];
            for(int i=0;i<2;i++){
                for(int j=0;j<m;j++){
                    a[i][j]= sc.nextInt();
                }
            }
            int sum = 0;
            System.out.println(back(a,sum,0,0,m));
            t--;
        }

        sc.close();
    }
}