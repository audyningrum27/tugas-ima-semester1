import java.util.Scanner;
public class watertankRevisi {
    public static void main(String[] audy) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kapasitas watertank : ");
        double tank = input.nextDouble();

        String alat = "";
        int ulang = 0;
        int pilih = 0;
        double isi = 0.0;

        do {
            System.out.println("\npilihlah alat yang digunakan untuk mengisi watertank");
            if (tank >= 16) {
                System.out.println("1. gelas, 1 liter \n2. ember, 10 liter \n3. galon, 16 liter \n4. tangan, 0.2 liter");
                System.out.print("Pilihan anda [ 1 2 3 4 ]: ");
                pilih = input.nextInt();
                System.out.println("-------------");
                switch (pilih) {
                    case 1:
                        alat = "gelas";
                        isi += 1.0;
                        tank = tank - 1.0;
                        System.out.println("alat yang dipilih adalah " + alat);
                        System.out.println("watertank sudah terisi " + isi + " liter");
                        ulang++;
                        break;
                    case 2:
                        alat = "ember";
                        isi += 10.0;
                        tank -= 10.0;
                        System.out.println("alat yang dipilih adalah " + alat);
                        System.out.println("watertank sudah terisi " + isi + " liter");
                        ulang++;
                        break;
                    case 3:
                        alat = "galon";
                        isi += 16.0;
                        tank -= 16.0;
                        System.out.println("alat yang dipilih adalah " + alat);
                        System.out.println("watertank sudah terisi " + isi + " liter");
                        ulang++;
                        break;
                    case 4:
                        alat = "tangan";
                        isi += 0.2;
                        tank -= 0.2;
                        System.out.println("alat yang dipilih adalah " + alat);
                        System.out.println("watertank sudah terisi " + isi + " liter");
                        ulang++;
                        break;
                    default:
                        System.out.println("inputan salah, coba masukkan angka yang lain");
                        break;
                }
            } else if (tank >= 10) {
                System.out.println("1. gelas, 1 liter \n2. ember, 10 liter \n4. tangan, 0.2 liter");
                System.out.print("\nPilihan anda [ 1 2 4 ]: ");
                pilih = input.nextInt();
                System.out.println("-------------");
                switch (pilih) {
                    case 1:
                        alat = "gelas";
                        isi += 1.0;
                        tank -= 1.0;
                        System.out.println("alat yang dipilih adalah " + alat);
                        System.out.println("watertank sudah terisi " + isi + " liter");
                        ulang++;
                        break;
                    case 2:
                        alat = "ember";
                        isi += 10.0;
                        tank -= 10.0;
                        System.out.println("alat yang dipilih adalah " + alat);
                        System.out.println("watertank sudah terisi " + isi + " liter");
                        ulang++;
                        break;
                    case 4:
                        alat = "tangan";
                        isi += 0.2;
                        tank -= 0.2;
                        System.out.println("alat yang dipilih adalah " + alat);
                        System.out.println("watertank sudah terisi " + isi + " liter");
                        ulang++;
                        break;
                    default:
                        System.out.println("inputan salah, coba masukkan angka yang lain");
                        break;
                }
            } else if (tank > 0) {
                System.out.println("1. gelas, 1 liter \n4. tangan, 0.2 liter");
                System.out.print("\nPilihan anda [ 1 4 ]: ");
                pilih = input.nextInt();
                System.out.println("-------------");
                switch (pilih) {
                    case 1:
                        alat = "gelas";
                        isi += 1.0;
                        tank -= 1.0;
                        System.out.println("alat yang dipilih adalah " + alat);
                        System.out.println("watertank sudah terisi " + isi + " liter");
                        ulang++;
                        break;
                    case 4:
                        alat = "tangan";
                        isi += 0.2;
                        tank -= 0.2;
                        System.out.println("alat yang dipilih adalah " + alat);
                        System.out.println("watertank sudah terisi " + isi + " liter");
                        ulang++;
                        break;
                    default:
                        System.out.println("inputan salah, coba masukkan angka yang lain");
                        break;
                }
            }
        } while (tank != 0);

        System.out.println(" ");
        System.out.println("*************");
        System.out.println("Isi watertank sudah penuh, proses pengisian dilakukan sebanyak " + ulang + " kali");
        System.out.println("*************");
        System.out.println(" ");

        input.close();
    }
}