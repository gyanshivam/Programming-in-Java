package Extraaas;
import java.util.*;

public class PP {
	
	public static void countWord(String str)
	{
		int count=0;
		
		for(int i=0; i<str.length(); i++)
		{	
			if(str.charAt(i)==' ')
				count++;
		}
		count++;
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		countWord(str);
	}

}
