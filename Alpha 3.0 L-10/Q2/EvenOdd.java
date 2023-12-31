import java.util.*;

class EvenOdd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 1;
        int val, evensum = 0, oddsum = 0;

        while(choice>0)
        {
            val = sc.nextInt();

            if(val%2==0)
                evensum = evensum + val;
            else
                oddsum = oddsum + val;

            choice = sc.nextInt();    
        }
                
        System.out.println("The sum of even numbers  = " +evensum+ " and The sum of odd numbers = "+oddsum);
    }
}



        
