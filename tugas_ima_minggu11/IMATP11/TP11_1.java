package IMATP11;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class TP11_1 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan N : ");
        int bilN = inp.nextInt();
        String[] arrN = new String[bilN];

        System.out.println("Masukkan element array nya : ");
        for(int i = 0; i < bilN; i++){
            arrN[i] = inp.next();
        }

        int index = new Random().nextInt(bilN);
        String value = arrN[index];
        System.out.println();
        System.out.println(value);

        inp.close();
    }
}
