class Break
{
	public static void main(String[] args)
	{
		outer:
			for(int i=0;i<3;i++)
			{
				System.out.print("Pass "+i+": ");
				for(int j=0;j<100;j++)
				{
					if(j==10)
						break outer;
					System.out.print(j+" ");
				}
				System.out.println("This wont get executed");
			}
		System.out.println("This will be executed. Here the loop ends.");
	}
}
