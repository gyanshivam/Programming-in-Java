import java.util.Scanner;

class Avg{
	
	static void avg(int x, int y, int z)
	{
		int result = (x+y+z)/3;
		System.out.print("\n"+result);
	}
	
	public static void main(String args[])
	{
		int x=0, y=0, z=0;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		avg(x,y,z);
	}
	
}