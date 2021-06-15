package sorting;

public class QuickSortPractice {


    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void QuickSort(int a[],int l,int h){
        if(l<h){
            int pivot = partiotion(a, l, h);
            QuickSort(a, l, pivot-1);
            QuickSort(a, pivot+1, h);
        }
    }

    public static int partiotion(int a[],int l,int h){
        int i=l;
        int j= h;
        int pivot = a[l];
        while(i<j){
            while(pivot>=a[i]&&i<h)i++;
            while(pivot<a[j]&&j>=l)j--;
            if(i<j)swap(a, i, j);
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
        int a[]={5,1,-1,100,500,8,-6,100};
        QuickSort(a, 0, a.length-1);
        Display(a);

    }
    
}
