import java.util.Scanner;

public class bilPrima {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = inp.nextInt();

        int cek = 0;
        int bagi = bil / 2;

        if (bil <= 1) {
            System.out.println("bukan prima");
        } else {
            for (int i = 2; i <= bagi; i++) {
                if (bil % i == 0) {
                    System.out.println("bukan prima");
                    cek = 1;
                    break;
                }
            }
            if (cek == 0) {
                System.out.println("prima");
            }
        }

        inp.close();
    }
}