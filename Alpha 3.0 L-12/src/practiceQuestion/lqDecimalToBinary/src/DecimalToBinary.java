import java.util.*;

class DecimalToBinary{
	
	static void convert(int deciNum)
	{
		int rem = 0, multiplicant = 1;
		long result = 0;
		
		while(deciNum>0)
		{
			rem = deciNum%2;
			
			result = result + rem * multiplicant;
			
			multiplicant *= 10;
			deciNum = deciNum/2;
			
		}
		
		System.out.println(result);
		
	}
	
	
	
	
	public static void main(String args[])
	{
		int deciNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		deciNum = sc.nextInt();
		
		convert(deciNum);
	}
}