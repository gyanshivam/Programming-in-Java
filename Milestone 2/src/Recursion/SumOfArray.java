package Recursion;

public class SumOfArray {

	public static int sum(int input[]) {
		if(input.length == 0)
			return 0;

		int arr[] = new int[input.length-1];

		for(int i=0; i<arr.length; i++)
			arr[i] = input[i+1];

		return input[0] + sum(arr);
	}
}


