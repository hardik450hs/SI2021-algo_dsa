import java.util.*;

/**
 * A_Helpful_Maths
 */
public class A_Helpful_Maths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = new String();
        st = sc.nextLine();
        ArrayList<Integer> l = new ArrayList<>();
        
        for(int i =0;i<st.length();i+=2){
            if(st.charAt(i)=='1') l.add(1);
            if(st.charAt(i)=='2') l.add(2);
            if(st.charAt(i)=='3') l.add(3);
        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.indexOf(i) +"+");
        }
        Collections.sort(l);
        st = null;
        for(int i=0;i<l.size();i++){
            System.out.print(l.indexOf(i) +"+");
        }
        

        sc.close();
    }
}