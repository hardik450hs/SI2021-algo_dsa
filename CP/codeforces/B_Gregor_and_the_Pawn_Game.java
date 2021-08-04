import java.util.Scanner;

/**
 * B_Gregor_and_the_Pawn_Game
 */
public class B_Gregor_and_the_Pawn_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n= sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            String g = sc.nextLine();
            //System.out.println(e +" x " +g);
            boolean v[] = new boolean[n];
            for(int i=0;i<n;i++){
                v[i]=false;
            }
            int c=0;
        
            for(int i=0;i<n;i++){
                //  System.out.println(e.charAt(i) +" x " +g.charAt(i));
                
                
                if(e.charAt(i)=='0' && g.charAt(i)=='1'){
                    // System.out.println("1 loop");

                    c++;
                    
                }
                else if(e.charAt(i)=='1' && g.charAt(i)=='1'){
                    
                        if(i>0 && e.charAt((i-1))=='1' && v[i-1]==false){
                            // System.out.println("2 loop");
                            c++;
                            v[i-1]=true;
                            
                        }
                        else if(i < n-1 && e.charAt(i+1)=='1' && v[i+1]==false){
                            // System.out.println("3 loop");
                            c++;
                            v[i+1]=true;
                            
                        }
                    
                }
            } 
            System.out.println(c);
            t--;
        }

        sc.close();
    }
}
