package array;

import java.util.Scanner;

/**
 * Array1_2
 * Check whether n is present in an array of size m or not.
Input - n,m (Input number, size of array)
- Take input n elements for the array
Output -> true/false
 */
public class Array1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean find = false;
        int numb,size;
        System.out.println("Enter Size of an array: ");
        size = sc.nextInt();
        System.out.println("Find number:");
        numb = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]==numb)
                find = true;
        }
        if(find==true)
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();
    }
}