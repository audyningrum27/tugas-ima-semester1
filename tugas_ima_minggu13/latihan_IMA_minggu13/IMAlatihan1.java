package latihan_IMA_minggu13;
import java.util.Scanner;
public class IMAlatihan1 {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama orang pertama\t: ");
        String nama1 = input.nextLine();
        System.out.print("Nama orang kedua\t: ");
        String nama2 = input.nextLine();
        
        sapa(nama1);
        sapa(nama2);
        input.close();
    }
    public static void sapa(String nama) {
        System.out.println("Hai, " + nama + ". Semangat pagi!");
    }
}
