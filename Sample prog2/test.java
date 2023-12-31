class A
{
	{
		System.out.println("This is in non-static block");
	}
	
	static
	{
		System.out.println("This is in static block");
	}
	
	public static void main(String args[])
	{
		System.out.println("This is in main block which is also static");
		new A();//object is created but no reference variable is declared and defined that can use this object. Even then it is sufficient to execute the non-static block. 
	}
}