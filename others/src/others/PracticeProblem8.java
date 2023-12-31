package others;
import java.util.*;

class PracticeProblem8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	
        	long ans=0;
        	
        	int i=0, rem;
        	
        	rem=n%2;
        	
        	while(n>0)
        	{
        		int k=1, mul=1;
        		
        		while(k<=i)
        		{
        			mul=mul*10;
        			k++;
        		}
        		
        		ans = ans+rem*mul;
        		n=n/2;
        		rem=n%2;
        		i++;
        	}
        	System.out.print(ans);
     }
}