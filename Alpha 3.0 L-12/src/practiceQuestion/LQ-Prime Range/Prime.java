import java.util.*;
import java.lang.*;

class Prime
{
    public static void print(int temp_num)
    {
        System.out.println(temp_num);
    }
    public static void cal_Prime(int num)
    {
        int temp_num = num;
        while(temp_num>1)
        {
            int flag=0;

            for(int i=2; i<=Math.sqrt(temp_num); i++)
            {
                if(temp_num%i==0)
                {
                    flag++;
                    break;
                }
                else
                    continue;
            }

            if(flag==0 && num>=2)
                print(temp_num);
            temp_num--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        cal_Prime(num);
    }
}