package strings;

import java.util.Scanner;

// Find Duplicate characters in a string.

public class StringBasic_4 {
    static void CountNumberOfOccuerence(String s){
        int max_value = 256;
        
        int arr[]=new int[max_value];
        char a[]=new char[max_value];


        for(char c:s.toCharArray()){
            int index=(int) c;
            a[index] = c;
            arr[index]++;
        }

        for(int i =0;i<max_value;i++){
            
            if(arr[i]>1){
                System.out.println(a[i]);
            }
        }
        
    }

    static void PrintString(String s){
        System.out.println(s);
    }

    static String TakeInput(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }



    public static void main(String[] args) {
        String str = TakeInput();
        PrintString(str);
        CountNumberOfOccuerence(str);
    }
    
}
