import java.util.*;

class Table
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    int i = 1;

    while(i<=10)
    {
        System.out.println(number+"X"+i+"="+number*i);
        i++;
    }
}
}