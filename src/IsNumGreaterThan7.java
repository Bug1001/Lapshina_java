import java.util.Scanner;

public class IsNumGreaterThan7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        if(in.hasNextInt()) {
            float num1 = in.nextFloat();
            if (num1 > 7) {
                System.out.println("Привет");
            }
        }
        else {
            System.out.println("Вы ввели не число");
        }
        in.close();
    }
}
