package sorting;

public class QuickSort {

    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public void Quicksort(int a[],int l,int h){
        if(l<h){
            int pivot = Partition(a, l, h);
            Quicksort(a, l, pivot-1);
            Quicksort(a, pivot+1, h);
        }
    }
    public static int Partition(int a[],int l,int h){
        int i=l;
        int j=h;
        int pivot = a[l];
        while(i<j){
            while(a[i]<=pivot && i<h)i++;
            while(a[j]>pivot && j>=l)j--;
            if(i<j){
                swap(a,i,j);
            }
        }
        swap(a, l, j);
        return j;
    }

    public static void Display(int a[]){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={7,6,5,4,3,2,1};
        QuickSort Q = new QuickSort();
        Q.Quicksort(a, 0, (a.length)-1);
        Display(a);

    }
}
