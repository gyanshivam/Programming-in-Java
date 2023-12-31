package others;
import java.util.*;

class PracticeProblem16{
	
	public static int[] accept()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0; i<n; i++)
			array[i]=sc.nextInt();
		
		return array;
	}
	
	
	public static void insertionSort(int arr[])
	{
		for(int i=1; i<arr.length; i++)
		{
			int temp = arr[i];
			int j;
			
			for(j=i-1; j>=0 && temp<=arr[j]; j--)
				arr[j+1]=arr[j];
			
			arr[j+1]=temp;
		}
	}
	
	public static void main(String[] args) {
		int arr1[] = accept();
		
		insertionSort(arr1);
		
		for(int i=0; i<arr1.length; i++)
			System.out.print(arr1[i]+" ");		
     }
}