package strings;

import java.util.Scanner;

public class reverseWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = new String();
        System.out.println("Enter a String:");
        String s= sc.next();
        System.out.println(s);

        int i = s.length()-1;
        String ans ="";

        while(i>=0){
            while(s.charAt(i) == ' ') i--;
            int j = i;
            
            while(s.charAt(i) != ' ') i--;

            if(ans.isEmpty()){
                ans = ans.concat(s.substring(i+1, j+1));
            }
            else{
                ans = ans.concat(" " +s.substring(i+1, j+1));
            }
        }
        System.out.println(ans);
    }
    
}
