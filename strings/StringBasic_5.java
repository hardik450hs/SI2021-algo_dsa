package strings;

// Write a program to reverse the string in place.

import java.util.Scanner;

public class StringBasic_5 {

    static String ReverseString(String str){
        int i = 0, j = str.length()-1;
        char char1[] = str.toCharArray();
        
        while(i<j){
            char temp = char1[i];
            char1[i] = char1[j];
            char1[j] = temp;
            i++;
            j--;

        }
        return new String(char1);
    }

    static String TakeInput(){
        Scanner sc = new Scanner(System.in);
        String str =new String();
        str = sc.nextLine();
        sc.close();
        return str;
    }

    static void PrintString(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = TakeInput();
        PrintString(str);
        str = ReverseString(str);
        PrintString(str);

    }
    
}
