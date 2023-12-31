package lastfewdoubtsresolution;

import java.util.Scanner;

public class AllSubsetOfString2 {
	
	public static void allSubStrings(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i, k=i; k<str.length(); k++)
			{
				System.out.println(str.substring(j, k+1));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		String str;
		
		while(tc>=0)
		{
			str = sc.next();
			
			allSubStrings(str);
			
			tc--;
		}

	}
}
