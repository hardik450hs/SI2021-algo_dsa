import java.util.HashSet;
import java.util.Scanner;

/**
 * A_Anton_and_Letters
 */
public class A_Anton_and_Letters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int n = s.length();
        HashSet<Character> c = new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='}' || s.charAt(i)==',' || s.charAt(i)==' '){
               continue;
            }
        else c.add(s.charAt(i));
        }

        System.out.println(c.size());
    }
}