package Recursion;
import java.util.Scanner;

import Recursion.SumOfArray.SumOfArray;


public class SumOfArrayMain {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++)
			input[i] = s.nextInt();
		
		System.out.println(SumOfArray.sum(input));
	}
}
