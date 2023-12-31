package lqBinaryToDecimal;
import java.util.*;
import java.lang.Math.*;

class BinToDeci
{
    static void convertToDecimal(int binary)
    {
        int sum=0, i=0, rem=0, cons=0;

        while(binary>0)
        {
            rem = binary%10;
            cons = (int)Math.pow(2, i);
            sum += rem*cons;
            i++;
            binary = binary/10;
        }

        System.out.println(sum);

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();
        
        convertToDecimal(binary);
    }
}