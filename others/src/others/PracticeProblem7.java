package others;
import java.util.*;

class PracticeProblem7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	
        	int a, i = 0, nN = 0;
        	
        	a = n%10;
    		
        	while(n>0)
        	{ 
        		int k=i, tV=1;
        		
        		while(k>0)
        		{
        			tV=tV*2;
        			k--;
        		}
        		
        		nN = nN+a*tV;
        		n = n/10;
        		a = n%10;
        		i++;
           	}
        	
        	System.out.print(nN);
     }
}