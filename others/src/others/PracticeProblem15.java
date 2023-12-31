package others;
import java.util.*;

class PracticeProblem15{
	
	public static int[] accept()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0; i<n; i++)
			array[i]=sc.nextInt();
		
		return array;
	}
	
	
	public static int binarysearch(int arr1[], int x)
	{
		int st=0, end=arr1.length-1;
        
        int mid = (st+end)/2;
        
        while(st<=end)
        {
            if(arr1[mid]==x)
                return mid;
            else if(arr1[mid]<x)
                st=mid+1;
            else
                end=mid-1;
            
            mid=(st+end)/2;
        }
        
        return -1;
	}
	
	public static void main(String[] args) {
		int arr1[] = accept();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
			
		while(k>0)
		{
			int x = sc.nextInt();
				
			System.out.println(binarysearch(arr1, x));
			 
			k--;
		}
        	
     }
}