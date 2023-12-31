import java.util.*;

class PracticeProblem10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	
        	int dec=0, decA=0, i=1, nN, pN, sPn;
        	sPn = sc.nextInt();
        	pN = sc.nextInt();
        	
        	while(i<=n-2)
        	{
        		nN = sc.nextInt();
        		
        		if(sPn<pN && pN>nN)
        			dec++;
        		else if(pN>nN)
        			decA++;
        		else if(pN==nN)
        		{
        			System.out.print(false);
        			return;
        		}
        		sPn = pN;
        		pN = nN;
        		i++;
        	}
        	
        	if(dec>1)
        		System.out.print(false);
        	else if(dec==1 && decA>=1)
        		System.err.print(false);
        	else
        		System.out.print(true);
     }
}