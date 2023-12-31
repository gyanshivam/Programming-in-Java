package others;
import java.util.*;

class PracticeProblem14{
	
	public static int[] accept()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0; i<n; i++)
			array[i]=sc.nextInt();
		
		return array;
	}
	
	public static void intersection(int arr1[], int arr2[])
	{
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
					arr2[j]=Integer.MAX_VALUE;
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int t = sc.nextInt();
		
		while(t>0)
		{
			
			int arr1[] = accept();
			int arr2[] = accept();
			
			intersection(arr1, arr2);
				
			t--;
		}
        	
     }
}