class Prime
{
	public static void main(String args[])
	throws java.io.IOException
	{
		int x;
		boolean flag;
		
		System.out.print("\nThe number that is to be checked:  ");
		x=System.in.read();
		
		if(x<2)
			flag=false;
		else
			flag=true;
		for(int i=2; i!=x;i++)
		{
			if((x%i)==0)
			{
				flag=false;
				break;
			}
		}

		if(flag)
			System.out.print("\n The no. is prime");
		else
			System.out.print("\n The no. is not prime");	

	}
}
	