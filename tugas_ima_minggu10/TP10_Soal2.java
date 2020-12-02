import java.util.Scanner;

public class TP10_Soal2 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = inp.nextInt();
        int hasil = 0;
        if ((bil >= 1) && (bil <= 10)) {
            for(int bil2 = (bil - 1); bil2 != 0; bil2--) {
                hasil = bil * bil2;
                bil = hasil;
            }
            System.out.println(hasil);
        } else {
            System.out.println("invalid");
        }
        inp.close();
    }
}