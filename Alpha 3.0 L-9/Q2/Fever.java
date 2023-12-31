import java.util.*;

class Fever
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double marks = sc.nextInt();

        if(marks > 100.00) 
            System.out.println("You have a fever");
        else
            System.out.println("You dont have fever");
    }
}