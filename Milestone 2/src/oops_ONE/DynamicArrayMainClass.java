package oops_ONE;

import java.util.*;

public class DynamicArrayMainClass {
	public static void main(String args[])
	{
		DAImplementation obj = new DAImplementation();
		
		Scanner sc = new Scanner(System.in);
		
		int val;
		int noOfElements;
		int index;
		
		for(int i=1; i<5; i++)
		{
			val = sc.nextInt();
			obj.add(val);
		}
		
		obj.print();
		
		noOfElements = sc.nextInt();
		
		while(noOfElements>0)
		{
			val = sc.nextInt();
			index = sc.nextInt();
			obj.print(val, index);
			noOfElements--;
		}
		System.out.println(obj.size());
		
		noOfElements = sc.nextInt();
		
	
		while(noOfElements>0)
		{
			val = sc.nextInt();
			index = sc.nextInt();
			
			obj.insert(val, index);
			noOfElements--;
		}
		
		if(!obj.isEmpty())
			System.out.println("Dynamic Array Is Implemented");
	}
}
