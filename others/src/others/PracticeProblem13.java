package others;
import java.util.*;

class PracticeProblem13{
	
	public static void unique(int arr[])
	{
		int var=arr[0], flag=1;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i==j)
					continue;
				else if(arr[i]==arr[j])
				{
					flag=0;
					break;
				}
				else if(arr[i]!=arr[j])
					flag=1;
			}
			
			if(flag==0)
			{
				var=arr[i];
				System.out.println(var);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int[] arr = new int[1000];
			
		while(t>0)
		{
			int n = sc.nextInt();
			
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			
			unique(arr);
			
			t--;
		}
	}
}