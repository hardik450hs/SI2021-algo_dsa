import java.util.Scanner;


/**
 * A_Chat_room
 */
public class A_Chat_room {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, w="hello";
        s=sc.next();
        int count = 0;
        int n = s.length();
        int j =0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==w.charAt(j)){
                count++;
                j++;
            }
            if(count==5) break;
            
        }
       
        if(count==5) System.out.println("YES");
        else System.out.println("NO");

        sc.close();
    }
}