import java.util.Scanner;
class pecahanUang {
    public static void tugas(){
        long nim = 6706202013L;
        String nama = "Nurul Qofifah Audyningrum";
        String namaPanggilan = "Audy";
        String kelas = "D3IF-44-01";

        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nama Panggilan : " + namaPanggilan);
        System.out.println("Kelas : " + kelas);
    }
    public static void main (String[] audy){
        // inputan dari user
        try (Scanner nilai = new Scanner (System.in)) {
            // deklarasi operasi pecahan mata uang
            int hitung1, hitung2, hitung3, hitung4, hitung5, hitung6, hitung7, hitung8, hitung9, hitung10, hitung11;
            int sisa1, sisa2, sisa3, sisa4, sisa5, sisa6, sisa7, sisa8, sisa9, sisa10, sisa11;

            tugas();
            System.out.println("---------------------------------");
            System.out.print("Masukan nilai uang : ");

            // nilai inputan user
            int uang = nilai.nextInt();

            // operasi pecahan mata uang
            hitung1 = uang / 100000;
            sisa1 = uang % 100000;

            hitung2 = sisa1 / 50000;
            sisa2 = uang % 50000;

            hitung3 = sisa2 / 20000;
            sisa3 = uang % 20000;

            hitung4 = sisa3 / 10000;
            sisa4 = uang % 10000;

            hitung5 = sisa4 / 5000;
            sisa5 = uang % 5000;

            hitung6 = sisa5 / 2000;
            sisa6 = uang % 2000;

            hitung7 = sisa6 / 1000;
            sisa7 = uang % 1000;

            hitung8 = sisa7 / 500;
            sisa8 = uang % 500;

            hitung9 = sisa8 / 200;
            sisa9 = uang % 200;

            hitung10 = sisa9 / 100;
            sisa10 = uang % 100;

            hitung11 = sisa10 / 50;
            sisa11 = uang % 50;


            System.out.println("---------------------------------");

            String intro1 = " lembar pecahan ";
            String intro2 = " keping pecahan ";

            // print
            System.out.println(hitung1 + intro1 + 100000);
            System.out.println(hitung2 + intro1 + 50000);
            System.out.println(hitung3 + intro1 + 20000);
            System.out.println(hitung4 + intro1 + 10000);
            System.out.println(hitung5 + intro1 + 5000);
            System.out.println(hitung6 + intro1 + 2000);
            System.out.println(hitung7 + intro1 + 1000);
            System.out.println(hitung8 + intro2 + 500);
            System.out.println(hitung9 + intro2 + 200);
            System.out.println(hitung10 + intro2 + 100);
            System.out.println(hitung11 + intro2 + 50);
            System.out.println(sisa11 + intro2 + "sen");
        }
    }
}