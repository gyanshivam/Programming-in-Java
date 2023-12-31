package fundamentals;
import java.util.*;

public class SalaryQ {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);

		long basic;
		String str;
		char grade;

		basic = sc.nextLong();
		str = sc.next();
		grade = str.charAt(0);

		long ts;
		ts = (long) (basic + ((20.0*basic)/100.0) + ((50.0*basic)/100.0) - ((11.0*basic)/100.0));


		if(grade=='A')
			ts=ts+1700;
		else if(grade=='B')
			ts=ts+1500;

		//int g = grade;

		else
			ts=ts+1300;

		System.out.println(ts);

	}
}


