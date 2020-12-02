package IMAJurnal11;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Jurnal11_2 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> arrN = new ArrayList<>();

        System.out.println("Masukkan element : ");
        int bilN = 0;
        while (bilN != -1) {
            bilN = inp.nextInt();
            arrN.add(bilN);
        }

        int index = arrN.size() - 1;
        arrN.remove(index);

        Collections.sort(arrN, Collections.reverseOrder());
        System.out.print("\nDescending : ");
        for(int i : arrN) {
            System.out.print(i + " ");
        }

        inp.close();
    }
}
