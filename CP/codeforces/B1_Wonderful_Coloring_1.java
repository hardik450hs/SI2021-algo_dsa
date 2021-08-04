import java.util.*;


/**
 * B1_Wonderful_Coloring_1
 */
public class B1_Wonderful_Coloring_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            List<Character> l = new ArrayList<>();
            Set<Character> set = new HashSet<>();

            for(int i=0;i<s.length();i++){
                l.add(s.charAt(i));
                set.add(s.charAt(i));
            }
            
            if(s.length()==1){
                System.out.println(0);
            }
            else if(set.size()==1){
                System.out.println(1);
            }
            else if(s.length()/2 > set.size()) System.out.println(set.size());
            else System.out.println(l.size()/2);
            t--;
        }

        sc.close();
    }
}