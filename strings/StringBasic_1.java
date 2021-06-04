package strings;
//Write a basic program to take input (String) from User and just print it.
import java.util.Scanner;

public class StringBasic_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
    
}
