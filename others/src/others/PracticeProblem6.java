package others;
import java.util.*;

class PracticeProblem6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	
        	int ola = 0, na = 0, rno =0;;
        	
        	na = n%10;
    		
    		if(na==0)
    		{
    			while(na==0)
    			{
    				n = n/10;
    				na = n%10;
    			}
    		}
    		
        	while(n>0)
        	{
        		rno = ola*10 + na;
        		ola = rno;
        		n = n/10;
        		na = n%10;
           	}
        	
        	System.out.print(rno);
     }
}