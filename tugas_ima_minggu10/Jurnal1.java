//import java.util.Scanner;
public class Jurnal1 {
    public static void main(String[] audy) {
        /*
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil1 = inp.nextInt();
        inp.close();
        */
        int bil1 = 1;
        int bil2 = 0;
        int hasil = 0;
        System.out.println();
        for(int i = 1; i <= 10; i++){
            bil2 = bil1;
            hasil = bil1 * bil2;
            System.out.print(hasil + " ");
            bil1++;
        }
        System.out.println();
        System.out.println();
    }
}