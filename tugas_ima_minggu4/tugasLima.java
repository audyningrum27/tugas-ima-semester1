import java.util.Scanner;

class tugasLima {
    public static void tugasMilik() {
        String nama, kelas, tugas;
        nama = "Nurul Qofifah Audyningrum";
        kelas = "D3IF-44-01";
        long nim = 6706202013L;
        tugas = "Menentukan bilangan penyebutnya";
        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("-------------------------------");
        System.out.println("Tugas No.5 : " + tugas);
        System.out.println("");
    }

    public static void tugasNoLima() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        long bilangan = in.nextLong();

        String huruf1, huruf2, huruf3, huruf4, huruf5, huruf6, huruf7;
        long angka1, angka2, angka3, angka4, angka5, angka6, angka7;

        if ((bilangan >= 1000000) && (bilangan <= 999999999)) {
            angka1 = bilangan / 1000000;
            huruf1 = " Jutaan";
            angka2 = bilangan / 100000 % 10;
            huruf2 = " Ratusan ribu";
            angka3 = bilangan / 10000 % 10;
            huruf3 = " Puluhan ribu";
            angka4 = bilangan / 1000 % 10;
            huruf4 = " Ribuan";
            angka5 = bilangan / 100 % 10;
            huruf5 = " Ratusan";
            angka6 = bilangan / 10 % 10;
            huruf6 = " Puluhan";
            angka7 = bilangan % 10;
            huruf7 = " Satuan";
            System.out.println(angka1 + huruf1);
            System.out.println(angka2 + huruf2);
            System.out.println(angka3 + huruf3);
            System.out.println(angka4 + huruf4);
            System.out.println(angka5 + huruf5);
            System.out.println(angka6 + huruf6);
            System.out.println(angka7 + huruf7);
        } else if (bilangan >= 100000) {
            angka2 = bilangan / 100000 % 10;
            huruf2 = " Ratusan ribu";
            angka3 = bilangan / 10000 % 10;
            huruf3 = " Puluhan ribu";
            angka4 = bilangan / 1000 % 10;
            huruf4 = " Ribuan";
            angka5 = bilangan / 100 % 10;
            huruf5 = " Ratusan";
            angka6 = bilangan / 10 % 10;
            huruf6 = " Puluhan";
            angka7 = bilangan % 10;
            huruf7 = " Satuan";
            System.out.println(angka2 + huruf2);
            System.out.println(angka3 + huruf3);
            System.out.println(angka4 + huruf4);
            System.out.println(angka5 + huruf5);
            System.out.println(angka6 + huruf6);
            System.out.println(angka7 + huruf7);
        } else if (bilangan >= 10000) {
            angka3 = bilangan / 10000 % 10;
            huruf3 = " Puluhan ribu";
            angka4 = bilangan / 1000 % 10;
            huruf4 = " Ribuan";
            angka5 = bilangan / 100 % 10;
            huruf5 = " Ratusan";
            angka6 = bilangan / 10 % 10;
            huruf6 = " Puluhan";
            angka7 = bilangan % 10;
            huruf7 = " Satuan";
            System.out.println(angka3 + huruf3);
            System.out.println(angka4 + huruf4);
            System.out.println(angka5 + huruf5);
            System.out.println(angka6 + huruf6);
            System.out.println(angka7 + huruf7);
        } else if (bilangan >= 1000) {
            angka4 = bilangan / 1000 % 10;
            huruf4 = " Ribuan";
            angka5 = bilangan / 100 % 10;
            huruf5 = " Ratusan";
            angka6 = bilangan / 10 % 10;
            huruf6 = " Puluhan";
            angka7 = bilangan % 10;
            huruf7 = " Satuan";
            System.out.println(angka4 + huruf4);
            System.out.println(angka5 + huruf5);
            System.out.println(angka6 + huruf6);
            System.out.println(angka7 + huruf7);
        } else if (bilangan >= 100) {
            angka5 = bilangan / 100 % 10;
            huruf5 = " Ratusan";
            angka6 = bilangan / 10 % 10;
            huruf6 = " Puluhan";
            angka7 = bilangan % 10;
            huruf7 = " Satuan";
            System.out.println(angka5 + huruf5);
            System.out.println(angka6 + huruf6);
            System.out.println(angka7 + huruf7);
        } else if (bilangan >= 10) {
            angka6 = bilangan / 10 % 10;
            huruf6 = " Puluhan";
            angka7 = bilangan % 10;
            huruf7 = " Satuan";
            System.out.println(angka6 + huruf6);
            System.out.println(angka7 + huruf7);
        } else if (bilangan < 10) {
            angka7 = bilangan % 10;
            huruf7 = " Satuan";
            System.out.println(angka7 + huruf7);
        } else {
            System.out.println("angka terlalu besar");
        }

        System.out.println("");
        in.close();
    }

    public static void main(String[] audy) {
        tugasMilik();
        tugasNoLima();
    }
}