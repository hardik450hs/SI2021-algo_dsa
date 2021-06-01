package array;

import java.util.Scanner;
/* Create an Array of size 10 of integers. Take input from the user for these
 10 elements and print the entire array after that.*/

 
public class Array1_1 {

    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter 10 int values:");
        
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        } 
        for(int i:arr){
            System.out.println(i);
        }
        sc.close();
    }
    
}
