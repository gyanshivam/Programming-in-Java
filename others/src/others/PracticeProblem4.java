package others;
import java.util.*;

class PracticeProblem4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=0, s=1;
		
		while(i<n)
		{
			int oddMax=1, j=0;
			int val=s;

			while(j<n-1)
			{
				oddMax += 2;
				j++;
			}
				
			while(val<=oddMax)
			{
				System.out.print(val);
				val += 2;
			}

			j=1;
			val=1;
			
			if(i==0)
			{
				i++;
				System.out.println();
				s+=2;
				continue;
			}
			else
			{
				while(j<=i)
				{
					System.out.print(val);
					val += 2;
					j++;
				}
			}
			System.out.println();
			s+=2;
			i++;
		}
	}
}