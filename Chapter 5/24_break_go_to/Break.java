class Break
{
	public static void main(String[] args)
	{
		boolean t = true;
		
		first:
		{
			second:
			{
				third:
				{
					System.out.println("Before break!");
					if(t)
						break second;
					System.out.println("This wont be displayed");
				}
				System.out.println("This wont be displayed");
			}
			System.out.println("After break gets implemented in second block.This will be displayed");
		}
	}
}