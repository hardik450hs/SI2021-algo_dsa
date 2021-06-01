package array;
/*Find the minimum and maximum element in an array.*/

import java.util.Scanner;

public class Array1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i = 0 ;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min = arr[0];
        for(int i =0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("max value is: " +max +" min valus is: " +min);
        sc.close();
    }    
}
