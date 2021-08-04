import java.util.Scanner;

/**
 * Even_tuples
 */
public class Even_tuples {
    static long factorial(long n) {
        long fact = 1;
        long i = 1;
        while(i <= n) {
           fact *= i;
           i++;
        }
        return fact;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		long t=0;
		if(sc.hasNextLong())
        t = sc.nextLong();
        while(t>0){
            long n=sc.nextLong();
            long q = sc.nextLong();
            long e[]=new long[(int)n+1];
            long o[]=new long[(int)n+1];
            e[0]=o[0]=0;
            for(long i=1;i<=n;i++){
                long a = sc.nextLong();
                if(a%2==0){
                    e[(int)i]=e[(int)i-1]+1;
                    o[(int)i]=o[(int)i-1];
                }
                else{
                    e[(int)i]=e[(int)i-1];
                    o[(int)i]=o[(int)i-1]+1;
                }
            }
            for(long i=0;i<q;i++){
                long l = sc.nextLong();
                long r=sc.nextLong();
                long odd=o[(int)r]-o[(int)l-1];
                //System.out.println(odd);
                
                long even=e[(int)r]-e[(int)l-1];
                //System.out.println(even);
                long ans=0;
                if(even>=3){
                    ans =(factorial(even)/(factorial(3)*factorial(even-3)))+(even*(factorial(odd)/(factorial(2)*factorial(odd-2))));
                }

                else{
                    ans = even*(factorial(odd)/(factorial(2)*factorial(odd-2)));
                }
                System.out.println(ans);
            }

            t--;
        }
        sc.close();
    }
}