package sorting;

public class InsertionSort
{
	public static void printArray(int[] a)
	{
		int j;
		for(j=0; j<a.length; j++)
			System.out.print(a[j] + ", ");
		System.out.println("\n");
	}
	
	public static void insertionSort(int[] a)
	{
		int curr_item_index, insert_index, curr_item;
		for (curr_item_index=1; curr_item_index<a.length; curr_item_index++)
		{
			insert_index=curr_item_index;
			curr_item = a[curr_item_index];
			while(insert_index>0 && curr_item<a[insert_index-1])
			{
				a[insert_index] = a[insert_index-1];
				insert_index--;
			}
				
			a[insert_index] = curr_item;
			System.out.println("Iteration " + (curr_item_index) + "==>");
			printArray(a);
		}
	}
	public static void main(String[] args)
	{
		int[] array = {10, -1, 8, 17, 0, -6, 4, 12};
		//int[] array = {2, -1, 5, 0};
		System.out.println("Before Sorting===>");
		printArray(array);
		insertionSort(array);
		System.out.println("After Sorting===>");
		printArray(array);
		
	}
}
