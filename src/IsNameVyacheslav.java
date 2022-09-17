import java.util.Scanner;

public class IsNameVyacheslav {

        public static void main(String[] args) {
            String ourName = "Вячеслав";
            Scanner in = new Scanner(System.in);

            System.out.print("Введите имя: ");
            String name1 = in.next();
            if(name1.equalsIgnoreCase(ourName)) {
                System.out.println("Привет, Вячеслав");
            }
            else {
                System.out.println("Нет такого имени");
            }

            in.close();
        }
}
