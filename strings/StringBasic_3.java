package strings;

// Write a program to remove all whitespaces in a given string.

import java.util.Scanner;

public class StringBasic_3 {

    static void RemoveSpace(String str){
        str = str.replace(" ", "");
        PrintString(str);
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
        RemoveSpace(str);
    }
    
}
