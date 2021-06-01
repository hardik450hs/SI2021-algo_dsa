package array;
//Given an number n. Find the number of occurrences of n in the array.

import java.util.Scanner;

public class Array1_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num:");
        int num = sc.nextInt();
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i = 0 ;i<size;i++){
            if(arr[i]==num)
                count++;
        }
        System.out.println(count);
        


        sc.close();
    }
    

    
}
