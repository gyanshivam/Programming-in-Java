package others;
import java.util.*;

class PracticeProblem18{
	
	public static int[] accept()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0; i<n; i++)
			array[i]=sc.nextInt();
		
		System.out.println();
		
		return array;
	}
	
	
	public static void push(int arr[])
	{		
		int count=0;
		
		int temp[] = new int[arr.length];
		
		int i=0, j=0;
		
		for(; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				temp[j]=arr[i];
				j++;
			}
			else if(arr[i]==0)
				count++;
		}
		
		for(;count>0;j++,count--)
			temp[j]=0;
		
		for(i=0, j=0; i<arr.length; i++, j++)
			arr[i]=temp[j];
	}
	
	public static void main(String[] args) {
		int arr[] = accept();
		
		push(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");		
     }
}