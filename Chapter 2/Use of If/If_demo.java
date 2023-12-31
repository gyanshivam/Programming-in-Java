import static java.lang.System.*;


class A
{
	public static void main(String[] args)
	{
		int x,y;
		x=10;y=20;
		
		if(x<y)
			out.println(" X is less than Y ");
		
		x=x*2;

		if(x==y)
			out.println(" X is now equal to Y ");
	
		x=x*2;
		
		if(x>y)
			out.println(" X is now greater than Y");
		//this won't display anything
		if(x==y)
			out.println(" You won't see this ");
	}
}
		
