import static java.lang.System.*;

class A
{
	public static void main(String[] args)
	{
		int x,y;
		
		y=20;

		for(x=0; x<10; x++)
		{
			out.println("This is x: " + x);
			out.println("This is y: " + y);
			y=y-2;
		}
	}
}