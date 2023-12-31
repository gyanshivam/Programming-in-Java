import java.util.*;

class Average
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, z;

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        int avg = (x+y+z)/3;

        System.out.println(avg);
    }
}