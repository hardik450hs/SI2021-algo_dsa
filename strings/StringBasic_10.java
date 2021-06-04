package strings;



// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class StringBasic_10 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPlaindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPlaindrome(String S) {
        // code here
        
        int j = S.length()-1;
        int i = 0;
        
        boolean p = true;
        while(i<j){
          if(S.charAt(i)==S.charAt(j)){
              p=true;
          } 
          else{
              p=false;
              break;
          }
          i++;
          j--;
        }
        if(p==true) {return 1;}
        else {return 0;}
        
    }
};
