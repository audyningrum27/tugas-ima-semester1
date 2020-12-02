import java.util.Scanner;

public class Jurnal3 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("masukkan jumlah baris : ");
        int bil = inp.nextInt();
        int num = 0;
        for (int i = 1; i <= bil; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if(num < 9) {
                    num++;
                } else {
                    num = 0;
                }
            }
            System.out.println();
        }
        inp.close();
    }
}
