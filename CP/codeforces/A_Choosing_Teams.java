import java.util.Scanner;

/**
 * A_Choosing_Teams
 */
public class A_Choosing_Teams {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int countStudent = 0;
        for(int i =0;i<n;i++){
            int a = sc.nextInt();
            if(a+k<=5)countStudent++;
            if(countStudent==3){
                count++;
                countStudent=0;
            }
        }
        System.out.println(count);
    }
}