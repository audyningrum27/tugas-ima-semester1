package LatihanArrayIMA;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class tugasArray4 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan N : ");
        int bilN = inp.nextInt();
        Integer[] arrN = new Integer[bilN];
        
        System.out.println("Masukkan bilangan yang ingin diurutkan : ");
        for (int i = 0; i < bilN; i++) {
            arrN[i] = inp.nextInt();
        }

        // ASCENDING //
        Arrays.sort(arrN);
        System.out.print("\nAscending : ");
        for(int i : arrN) {
            System.out.print(i + " ");
        }

        // DESCENDING //
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