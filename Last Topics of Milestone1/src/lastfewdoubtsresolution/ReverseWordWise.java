package lastfewdoubtsresolution;

import java.util.Scanner;

public class ReverseWordWise {
	
	public static void reverseWords(String str)
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		String str;
		
		while(tc>=0)
		{
			str = sc.nextLine();
			
			reverseWords(str);
			
			tc--;
		}

	}
}
