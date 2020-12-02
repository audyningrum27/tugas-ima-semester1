import java.util.Scanner;

public class latihanEmpat {
    public static void tugasMilik() {
        System.out.println("");
        System.out.println("Nama : Nurul Qofifah Audyningrum");
        System.out.println("NIM : 6706202013");
        System.out.println("Kelas : D3IF-44-01");
        System.out.println("-------------------------------");
        System.out.println("");
    }

    public static void main(String[] audy) {
        tugasMilik();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kota tujuan : ");
        String kota = input.nextLine();
        System.out.print("Masukkan jumlah penumpang : ");
        int penumpang = input.nextInt();

        int harga, bayar;
        String output = ("Harga tiket yang harus dibayar : ");

        switch (kota) {
            case "Jakarta":
                harga = 145000;
                bayar = penumpang * harga;
                System.out.println(output + bayar);
                break;
            case "Bogor":
                harga = 200000;
                bayar = penumpang * harga;
                if(bayar >= 250000) {
                    int diskon = bayar * 10 / 100;
                    System.out.println("Diskon 10% = " + diskon);
                    bayar -= diskon;
                }
                System.out.println(output + bayar);
                break;
            case "Garut":
                harga = 75000;
                bayar = penumpang * harga;
                System.out.println(output + bayar);
                break;
            case "Purwakarta":
                harga = 75000;
                bayar = penumpang * harga;
                System.out.println(output + bayar);
                break;
            default:
                System.out.println("kota yang anda masukkan diluar cakupan");
                break;
        }

        System.out.println("");
        input.close();
    }
}
