import java.util.*;

class Prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        int x = (int) Math.sqrt(num);

        for(int i=2; i<=x; i++)
        {
            if(num%i==0)
            {
                System.out.println("Number is not Prime");
                return;
            }
        }

        System.out.println("Number is prime");
    }
}