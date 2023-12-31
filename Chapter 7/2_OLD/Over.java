class OverLoadDemo
{
	void test()
	{
		System.out.println("No Parameters");
	}

	void test(int a, int b)
	{
		System.out.println("a and b: " +a+ " " +b);
	}

	void test(double a)
	{
		System.out.println("double a: " +a);	}
}

class Overload
{
	public static void main(String args[])
	{
		OverLoadDemo ob=new OverLoadDemo();

		int i=88;

		ob.test();
		ob.test(10,20);
		ob.test(i);
		ob.test(123.25);	
	}
}