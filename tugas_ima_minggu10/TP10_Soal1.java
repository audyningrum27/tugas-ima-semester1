import java.util.Scanner;
public class TP10_Soal1 {
    public static void main(String[] audy) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = inp.nextInt();
        if((bil >= 1) && (bil <= 10)) {
            for(int i = 1; i <= 10; i++){
                int hasil = i * bil;
                System.out.println(i + " x " + bil + " = " + hasil);
            }
        } else {
            System.out.println("coba angka 1 s.d. 10");
        }
        inp.close();
    }
}
