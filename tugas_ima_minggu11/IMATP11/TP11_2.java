package IMATP11;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class TP11_2 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan N : ");
        int bilN = inp.nextInt();
        Integer[] arrN = new Integer[bilN];

        System.out.println("Masukkan element array nya : ");
        for(int i = 0; i < bilN; i++){
            arrN[i] = inp.nextInt();
        }

        Arrays.sort(arrN, Collections.reverseOrder());
        System.out.print("\n\nDescending : ");
        for(int i : arrN) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        inp.close();
    }
}
