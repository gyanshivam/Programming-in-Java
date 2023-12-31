package ArraysCCL9Q1;
import java.util.*;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tCase = sc.nextInt();
		int aSize;
		int sum = 0;
		
		while(tCase>0)
		{
			aSize = sc.nextInt();
			int arr[] = new int[aSize];
			
			for(int i=0; i<aSize; i++)
			{
				arr[i] = sc.nextInt();
				sum = sum+arr[i];
			}
			System.out.println(sum);
			sum=0;
			tCase--;
		}
		
		
	}

}
