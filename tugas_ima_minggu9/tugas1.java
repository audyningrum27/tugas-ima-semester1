package tugas;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Berapa baris segitiga : ");
        int baris = inp.nextInt();
        int kolom = 1;
        for(int i = baris; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= kolom; j++) {
                System.out.print(kolom + " ");
            }
            System.out.println();
            kolom++;
        }
        inp.close();
    }
}