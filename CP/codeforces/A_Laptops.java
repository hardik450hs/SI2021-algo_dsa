import java.util.*;

/**
 * A_Laptops
 */
public class A_Laptops {
    private static final int Comparator = 0;
    private static final int Integer = 0;
    static Scanner sc = new Scanner(System.in);
    class node{
        int a;
        int b;
        node(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int a;
        int b;
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            l.add(a, b);
        }
        l.sort(Comparator<Integer> a);
    }
}