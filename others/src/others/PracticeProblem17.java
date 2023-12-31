package others;
import java.util.*;

class PracticeProblem17{
	
	public static int[] accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0; i<n; i++)
			array[i]=sc.nextInt();
		
		return array;
	}
	
	
	public static int[] mergeSort(int arr1[], int arr2[])
	{		
		int arr[] = new int[ arr1.length+arr2.length];
		
		for(int i=0, j=0, k=0; j<arr1.length || k<arr2.length; i++)
		{
			if(j>=arr1.length && k<arr2.length)
			{
				arr[i]=arr2[k];
				k++;
			}
			
			else if(k>=arr2.length && j<arr1.length)
			{
				arr[i]=arr1[j];
				j++;
			}
				
			else if(arr1[j]<=arr2[k])
			{
				arr[i]=arr1[j];
				j++;
			}
			
			else
			{
				arr[i]=arr2[k];
				k++;
			}
					
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr1[] = accept();
		int arr2[] = accept();
		
		int arr[] = mergeSort(arr1, arr2);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
     }
}