package strings;

// Write a program to check whether given two strings are anagram or not.
import java.util.*;

public class StringBasic_6 {
    static Scanner sc = new Scanner(System.in);
    static Boolean Anagram(String s1, String s2) {
        boolean anagram = true;

        int al[] = new int[256];

        for (char c : s1.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for (char c : s2.toCharArray()) {
            int index = (int) c;
            al[index]--;
        }

        for (int i = 0; i < 256; i++) {
            if (al[i] != 0) {
                anagram = false;
                break;
            }

        }
        return anagram;
    }

    static void AnagramOrNot(boolean anagram) {
        if (anagram == true) {
            System.out.println("is Anagram");
        } else
            System.out.println("is not Anagram");
    }

    static String ToTakeString() {
        
        String str = new String();
        str = sc.nextLine();
        //sc.close();
        return str;
    }

    public static void main(String[] args) {
        String str1 = ToTakeString();
        String str2 = ToTakeString();
        Boolean anagram = Anagram(str1, str2);
        AnagramOrNot(anagram);
        sc.close();
    }

}
