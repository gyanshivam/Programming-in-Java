class Ret
{
	public static void main(String[] args)
	{
		boolean t=true;
		
		System.out.println("Before the return");
		
		if(t)
			return;
		
		System.out.println("This will never be executed");
	}
}