package jurnal_IMA_minggu13;
import java.util.Scanner;
public class IMAjurnal1 {
    public static void main(String[] audy){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama orang pertama\t: ");
        String nama1 = input.nextLine();
        System.out.print("Nama orang kedua\t: ");
        String nama2 = input.nextLine();
        System.out.print("Jam\t\t\t: ");
        int waktu = input.nextInt();
        
        sapa(nama1, waktu);
        sapa(nama2, waktu);
        input.close();
    }
    public static void sapa(String nama, int waktu) {
        String sapaan = "";
        if(waktu >= 6 && waktu <= 11){
            sapaan = "Pagi";
        } else if (waktu >= 12 && waktu <= 14) {
            sapaan = "Siang";
        } else if (waktu >= 15 && waktu <= 17) {
            sapaan = "Sore";
        } else if (waktu >= 1 && waktu <= 5
        || waktu >= 18 && waktu <= 24) {
            sapaan = "Malam";
        }
        System.out.println("Halo, " + nama + ". Selamat " + sapaan + ".");
    }
}
