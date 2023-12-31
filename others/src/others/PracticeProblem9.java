package others;
import java.util.*;

class PracticeProblem9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	
        	int i=1;
        	
        	while(i*i<=n)
        		i++;
        		
        	System.out.print(--i);
     }
}