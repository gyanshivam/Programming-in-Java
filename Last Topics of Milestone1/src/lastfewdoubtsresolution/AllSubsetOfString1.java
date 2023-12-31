package lastfewdoubtsresolution;

import java.util.Scanner;

public class AllSubsetOfString1 {
	
	public static void allSubStrings(String str)
	{
		for(int i=0; i<=str.length()-1; i++)
		{
			for(int k=0; k<=str.length()-i-1; k++)
			{
				System.out.println(str.substring(k, k+i+1));
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

	public static void allSubStrings(String str)
		{

}
