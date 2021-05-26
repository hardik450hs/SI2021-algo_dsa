/*
Selection Sort
time complexity:
        best: omega(n^2)
        avg: theta(n^2)
        worst: O(n^2)
 * Space: O(1)
*/
package sorting;
public class SelectionSort {
    public static void main(String[] args) {
        int [] a={3,5,-1,8,0,-5,6,4};
        int n=a.length;

        for(int i=0;i<n-1;i++){
            int midIndex = i;
            for(int j=i;j<n;j++){
                if(a[j]<a[midIndex]){
                    midIndex=j;
                }
            }
            int temp=a[midIndex];
            a[midIndex]=a[i];
            a[i]=temp;
        }
        for(int item:a){
            System.out.print(item + " ");
        }
    }
    
}
