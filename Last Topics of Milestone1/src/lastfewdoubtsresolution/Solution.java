package lastfewdoubtsresolution;
import java.util.*;

public class Solution {
	
	public static void sort(int arr1[], int arr2[])
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}
	
	public static int[] intersection(int arr1[], int arr2[])
	{
		int arrAns[] = new int[arr1.length+arr2.length];
		
		for(int i=0, j=0, k=0; i<arr1.length && j<arr2.length; )
		{
			if(arr1[i]==arr2[j])
			{
				arrAns[k]=arr1[i];
				k++;
				i++;
				j++;
			}
			
			else if(arr1[i]<arr2[j])
				i++;
			else
				j++;
		}
		
		return arrAns;
	}

}
