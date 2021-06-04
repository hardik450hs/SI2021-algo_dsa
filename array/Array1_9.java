package array;

import java.util.Arrays;
import java.util.Scanner;

// Find the range of the array. Range means the difference between the
// maximum and minimum element in the array.

public class Array1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);

        int diff = arr[size-1]-arr[0];
        System.out.println(diff);
        sc.close();
    }   
}
