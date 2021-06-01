package array;
//Find the Kth largest and Kth smallest number in an array.

import java.util.*;

public class Array1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kth value");
        int k=sc.nextInt();
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

        if(k>size)
            System.out.println("Not possibele");
        else{
            int min = arr[k-1];
            int max = arr[size-k];
            System.out.println(k +"th smallest value is "+min +" and " +k +"th largest value is " +max);
        }

        sc.close();
    }    
}
