import static java.lang.System.*;


interface F1
{
	void f1();
	void f2();
}


class A
{
	public void f1()
	{
		out.println("****************");
	}
	public void f2()
	{
		out.println("##############");
	}
}

class B extends A implements F1
{
}

class InterfaceImplementation
{
	public static void main(String args[])
	{
		B ref1 = new B();
		ref1.f1();
		ref1.f2();
	}
}