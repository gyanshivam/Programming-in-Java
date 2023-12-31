import java.util.*;

class Bill
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int  eraser = sc.nextInt();

        int totalCost = ((18*(pencil+pen+eraser))/100) + (pencil+eraser+pen);
        System.out.println(totalCost);
    }
}