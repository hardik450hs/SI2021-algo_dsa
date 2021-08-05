public class main {
    public static void main(String[] args) {
        int ans = 1;
        int prev = 1;
        int n = 10;
        for(int i=1;i<=n;i++){
            int sum = ans+prev;
            prev = ans;
            ans=sum;
            
        }
        System.out.println(ans);
    }
}
