import java.util.*;

class Fact
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int facto = 1;

        for(int i = 2; i<=number; i++)
            facto = facto * i;
               
        System.out.println("Factorial = " +facto);
    }
}