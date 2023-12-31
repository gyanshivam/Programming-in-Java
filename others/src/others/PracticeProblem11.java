package others;
import java.util.*;

class PracticeProblem11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i=1, r=0, l=n;

		while(i<=n)
		{
			int j=1;
			
			while(j<=l)
			{
				System.out.print(j);
				j++;
			}
			
			j=1;
			while(j<=r)
			{
				if(i==1)
					break;
				else
					System.out.print('*');
				j++;
			}
			
			j=l;
			
			while(j>=1)
			{
				System.out.print(j);
				j--;
			}
			
			i++;
			r+=2;
			l--;
			System.out.println();
		}
	}
}