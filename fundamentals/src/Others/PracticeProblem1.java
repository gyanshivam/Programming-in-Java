import java.util.*;

class PracticeProblem1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        
        	int i=1;
        
        	while(i<=n/2+1)
        	{
            		int x=1;
            
            		while(x<=(n/2+1)-i)
            		{
                		System.out.print(" ");
                		x++;
            		}
            
            		int j=1;
            
            		while(j<=(2*i)-1)
            		{
                		System.out.print("*");
                		j++;
            		}
            
            		System.out.println();
            		i++;
        	}

		i=1;
		
		while(i<=n/2)
		{
			int x=1;

			while(x<=i)
			{
				System.out.print(" ");
				x++;
			}
			
			int j=1;

			while(j<=((n/2)-i)+1)
			{
				System.out.print("*");
				j++;
			}

			int k=1;
			
			while(k<=(n/2)-i)
			{
				System.out.print("*");
				k++;
			}

			System.out.println();
			i++;
		}	
	
	}
}