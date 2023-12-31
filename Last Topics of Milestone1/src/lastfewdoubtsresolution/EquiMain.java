package lastfewdoubtsresolution;

import java.util.Scanner;

public class EquiMain {

	public static void main(String[] args) {
		int ch, size;
		
		Scanner sc = new Scanner(System.in);
		
		ch = sc.nextInt();
		
		int arr[];
		
		while(ch>0)
		{
			size = sc.nextInt();
			arr = new int[size];
			
			for(int i=0; i<size; i++)
				arr[i]=sc.nextInt();
			
			System.out.println(Solution2.arrayEquilibriumIndex(arr));
			
			ch--;
		}

	}

}
