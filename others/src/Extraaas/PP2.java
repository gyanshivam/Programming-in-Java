package Extraaas;
import java.util.*;

public class PP2 {
	
	public static void palli(String str)
	{
		String strR ="";
		for(int i=0; i<str.length(); i++)
			strR = str.charAt(i) + strR;
	
		System.out.println(str.equals(strR));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		palli(str);
	}

}
