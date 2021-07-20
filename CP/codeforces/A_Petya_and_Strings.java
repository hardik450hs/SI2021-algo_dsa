import java.util.Scanner;

/**
 * A_Petya_and_Strings
 */
public class A_Petya_and_Strings {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String st = new String();
        String st1 = new String();
        st = s.nextLine().toLowerCase();
        st1 = s.nextLine().toLowerCase();
        int c1 =0;
        int c2=0;
        for(int i=0;i < st.length() ;i++){
            if(st.charAt(i)==st1.charAt(i)) continue;
            else{
                c1 = st.charAt(i);
                c2 = st1.charAt(i);
                break;
            }


        }
        if(c1==c2){
            System.out.println(0);
        }
        else if(c1 < c2){
            
            System.out.println(-1);
        }
        else
            System.out.println(1);

        s.close();
        
    }
}