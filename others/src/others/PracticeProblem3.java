package others;
import java.util.*;

class PracticeProblem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	
        	int i=2, flag=0;
        	
        	while(i<=n)
        	{
        		int j=2;
        		
        		while(j<=i/2)
        		{
        			if(i%j==0)
        			{
        				flag=1;
        				break;
        			}
        			else
        				flag=0;
        			j++;
        		}
        		if(flag==0)
        			System.out.println(i);
        		i++;
        	}
     }
}