package array;

import java.util.*;

public class Array1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);

        for(int i:arr){
            System.out.print(i +" ");
        }
        sc.close();
    }
    
}
