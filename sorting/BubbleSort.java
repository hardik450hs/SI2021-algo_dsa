package sorting;
/**
 * BubbleSort
 
 * time complexity:
        best: omega(n)
        avg: theta(n^2)
        worst: O(n^2)
 * Space: O(1)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int a[]={5,6,-1,0,9,4,6,-3};
        int n= a.length;
        for(int i=0;i<n-1;i++){
            boolean sorted=true;
            for(int j=0;j<n-1-i;j++){   //-i so it will never look for sorted elements
                
                if(a[j+1]<a[j]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    sorted=false;
                }
            }
            if(sorted)
            break;

        }
        for(int i:a){
            System.out.print(i +" ");
        }
    }
}