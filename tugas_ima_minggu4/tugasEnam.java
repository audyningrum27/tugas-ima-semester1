import java.util.Scanner;
public class tugasEnam {
    String[] huruf = { "", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas" };
    public String bilangan(int angka) {
        if (angka < 12) {
            return huruf[(int) angka];
        } else if (angka >= 12 && angka <= 19) {
            return huruf[(int) angka % 10] + " belas ";
        } else if (angka >= 20 && angka <= 99) {
            return huruf[(int) angka / 10] + " puluh " + huruf[(int) angka % 10];
        } else if (angka >= 100 && angka <= 199) {
            return "seratus " + bilangan(angka % 100);
        } else if (angka >= 200 && angka <= 999) {
            return huruf[(int) angka / 100] + " ratus " + bilangan(angka % 100);
        }
        return "Angka terlalu besar";
    }

    public static void tugasMilik() {
        System.out.println("");
        System.out.println("Nama : Nurul Qofifah Audyningrum");
        System.out.println("NIM : 6706202013");
        System.out.println("Kelas : D3IF-44-01");
        System.out.println("-------------------------------");
        System.out.println("Tugas No.6 : Konversi Angka Menjadi Bilangan");
        System.out.println("");
    }

    public static void main (String[] audy) {
        tugasMilik();

        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan bilangan : ");
        System.out.print(new tugasEnam().bilangan(in.nextInt()));
        in.close();
        System.out.println("");
    }
}