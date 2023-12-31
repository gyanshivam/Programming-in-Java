class Test
{
	int a,b;

	Test(int i,int j)
	{
		a=i;
		b=j;
	}

	boolean equals(Test o)
	{
		if(o.a == a && o.b == b) 
			return true;
		else
			return false;
	}
}

class PassOb
{
	public static void main(String args[])
	{
		Test indian_food = new Test(100,22);
		Test chineese_food = new Test(100,22); 
		Test cloth = new Test(-1,-1);

		System.out.println("indian_food == chineese_food: " +indian_food.equals(chineese_food));
		System.out.println("indian_food == cloth: " +indian_food.equals(cloth));
	}
}