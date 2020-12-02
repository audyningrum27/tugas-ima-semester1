package tugas;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = inp.nextInt();
        int i = 1, j = 1, k = 1;
        String cetak = "*";

        // a //
        System.out.println();
        System.out.println("a.");
        for (i = 1; i <= bil; i++) {
            for (j = 1; j <= bil; j++) {
                System.out.print(cetak + " ");
            }
            System.out.println();
        }
        System.out.println();

        // b //
        System.out.println("b.");
        i = 1;
        while (i <= bil) {
            j = 1;
            while (j <= i) {
                System.out.print(cetak + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();

        // c //
        System.out.println("c.");
        for (i = bil; i > 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(cetak + " ");
            }
            System.out.println();
        }
        System.out.println();

        // d //
        System.out.println("d.");
        for (i = bil; i > 0; i--) {
            for (j = bil; j > i; j--) {
                System.out.print("  ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(cetak + " ");
            }
            System.out.println();
        }
        System.out.println();

        // e //
        System.out.println("e.");
        for (i = 1; i <= bil; i++) {
            for (j = 1; j <= (bil - i); j++) {
                System.out.print("  ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(cetak + " ");
            }
            System.out.println();
        }
        System.out.println();

        inp.close();
    }
}