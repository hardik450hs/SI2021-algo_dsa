package sorting;



public class InsertionSortPractice {
    public static void Insertion(int a[]){
        for(int i=1;i<a.length;i++){
            
            int index = i;
            int InsertItem = a[i];
            while(index > 0 && InsertItem<a[index-1]){
                a[index]=a[index-1];
                index--;
            }
            a[index]=InsertItem;
            System.out.println();
            Display(a);

        }
    }
    public static void Display(int a[]){
        for(int I:a){
            System.out.print(I +" ");
        }
    }

    public static void main(String[] args) {
        int a[]={18,-1,5,9,2,-6,-7,19,2,3};
        Display(a);
        Insertion(a);
        System.out.println();
        Display(a);

    }
    
}
