import java.util.Scanner;

public class Jurnal2 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Cek bilangan prima : ");
        int bil = inp.nextInt();

        int cek = 0;
        int bagi = bil / 2;

        if ((bil >= 1) && (bil <= 1000)) {
            if (bil <= 1) {
                System.out.println("BUKAN");
            } else {
                for (int i = 2; i <= bagi; i++) {
                    if (bil % i == 0) {
                        System.out.println("BUKAN");
                        cek = 1;
                        break;
                    }
                }
                if (cek == 0) {
                    System.out.println("YA");
                }
            }
        } else {
            System.out.println("invalid");
        }

        inp.close();
    }
}
