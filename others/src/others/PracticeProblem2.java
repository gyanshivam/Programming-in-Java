package others;
import java.util.*;

class PracticeProblem2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        
        	System.out.print("*");
        	
        	int i=1;
        	
        	while(i<=n)
        	{
        		System.out.print("\n*");
        		int j=1;
        		while(j<=i)
        		{
        			System.out.print(j);
        			j++;
        		}
        		
        		j=j-2;
        		
        		while(j>=1)
        		{
        			System.out.print(j);
        			j--;
        		}
        		System.out.print('*');
        		i++;
        	}
        	i=n-1;
        	
        	while(i>=1)
        	{
        		System.out.print("\n*");
        		int j=1;
        		while(j<=i)
        		{
        			System.out.print(j);
        			j++;
        		}
        		
        		j=j-2;
        		
        		while(j>=1)
        		{
        			System.out.print(j);
        			j--;
        		}
        		System.out.print('*');
        		i--;
        	}
        	
        	System.out.print("\n*");
	}
}