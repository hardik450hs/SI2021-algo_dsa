package array;

import java.util.Scanner;

//Given an array which consists of only 0, 1 and 2. Sort the array without
// using any sorting algorithm.

public class Array1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter only 0,1 and 2");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int hi = arr.length - 1;
        int low = 0;
        int mid = 0;

        while (mid <= hi) {

            if (arr[mid] == 1) {
                mid++;

            } else if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;

            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}
