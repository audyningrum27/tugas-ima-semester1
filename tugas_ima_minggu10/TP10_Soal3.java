import java.util.Scanner;
public class TP10_Soal3 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = inp.nextInt();
        
        for (int i = 1; i <= bil; i++) {
            for (int j = 1; j <= (bil - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        inp.close();
    }
}