package lastfewdoubtsresolution;

import java.util.*;

public class Pallindrome {
	
	public static boolean solution(String str)
	{
		boolean ans = true;
		
		for(int i=0, j=str.length()-1; i<=j; i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				ans = false;
				return ans;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		boolean ans = solution(str);
		
		if(ans)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}

}
