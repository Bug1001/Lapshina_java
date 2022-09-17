import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIntMultiple3 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        int i = 0;
        ArrayList<String> arrayStr1 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа (для выхода введите -1 и нажмите Enter): ");
        while(true) {
            if (in.hasNextInt()) {
                arrayList1.add(in.nextInt());
                if (arrayList1.get(i) == -1) {
                    break;
                }
                i++;
            }
           else {
               arrayStr1.add(in.next());
            }
        }
        for(int k = 0; k < arrayList1.size(); k++) {
            if(arrayList1.get(k) % 3 == 0) {
                System.out.print(arrayList1.get(k));
                System.out.print(" ");
            }
        }

        in.close();
    }
}
