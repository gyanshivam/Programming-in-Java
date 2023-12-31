package lastfewdoubtsresolution;
import java.util.*;
import java.lang.*;

public class ArrayIntersectionMain {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int arr1[], arr2[];
		
		while(n>0)
		{
			int size, size2;
			
			size = sc.nextInt();
			arr1 = new int[size];
			
			for(int i=0; i<size; i++)
				arr1[i] = sc.nextInt();
			
			size2 = sc.nextInt();
			arr2 = new int[size2];
			
			for(int i=0; i<size2; i++)
				arr2[i] = sc.nextInt();
			
			Solution.sort(arr1,arr2);
			
			if(size<size2)
				size=size2;
			
			int arrAns[] = new int[size];
			
			arrAns = Solution.intersection(arr1, arr2);
			
			for(int i=0; i<size; i++)
			{
				if(arrAns[i]>0)
					System.out.print(arrAns[i]+" ");
			}
			
			System.out.println();
			n--;
		}
	}

}
