package IMAJurnal11;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Jurnal11_1 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        ArrayList<String> arrN = new ArrayList<>();

        System.out.println("Masukkan nama : ");
        String str = "";
        while (!str.equals("-")) {
            str = inp.nextLine();
            arrN.add(str);
        }

        int idx = arrN.size() - 1;
        arrN.remove(idx);

        int index = new Random().nextInt(arrN.size());
        String value = arrN.get(index);
        System.out.println(value);
        
        inp.close();
    }
}
