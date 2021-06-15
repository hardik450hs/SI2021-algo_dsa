package sorting;

public class MergeSort {



    public static void Mergesort(int a[],int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            Mergesort(a, l, mid);
            Mergesort(a, mid+1, r);
            Merge(a,l,mid,r);
        }
    }

    public static void Merge(int a[],int l,int mid, int r){
        int i = l;
        int j = mid+1;
        int k = l;
        int b[] = new int[a.length];
        while(i<=mid && j<=r){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                b[k]=a[j];
                k++;
                j++;
            }

        }
        else{
            while(i<=mid){
                b[k]=a[i];
                i++;k++;
            }
        }
        for(k=l;k<=r;k++){
            a[k]=b[k];
        }
    }

    public static void Display(int a[]){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={5,3,2,1};
        Mergesort(a, 0, a.length-1);
        Display(a);
    }
}
