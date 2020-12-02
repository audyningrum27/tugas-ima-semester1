import java.util.Scanner;
class tiga {
    public static void tugasMilik() {
        String nama, kelas, tugas;
        nama = "Nurul Qofifah Audyningrum";
        kelas = "D3IF-44-01";
        long nim = 6706202013L;
        tugas = "Besok adalah hari?";
        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("-------------------------------");
        System.out.println("Tugas No.3 : " + tugas);
        System.out.println("");
    }

    public static void tugasNoTiga() {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Sekarang hari : ");
        int sekarang = input.nextInt();

        System.out.print("N hari kedepan : ");
        int nHari = input.nextInt();
        
        System.out.println("-------------------------------");
        
        String hariIni = "Sekarang hari ";
        String hariBesok = "Besok adalah hari ";
        String hariKedepan = " hari kedepan adalah hari ";
        String notValid = "Silakan pilih angka 1,2,3 s.d 7";
        String hari = "";

        if(sekarang == 1){
            System.out.println(hariIni + "Senin");
            System.out.println(hariBesok + "Selasa");
            if((nHari % 7) == 1) {
                hari = "Selasa";
            } else if((nHari % 7) == 2) {
                hari = "Rabu";
            } else if((nHari % 7) == 3) {
                hari = "Kamis";
            } else if((nHari % 7) == 4) {
                hari = "Jum'at";
            } else if((nHari % 7) == 5) {
                hari = "Sabtu";
            } else if((nHari % 7) == 6) {
                hari = "Minggu";
            } else if((nHari % 7) == 0) {
                hari = "Senin";
            } System.out.println(nHari + hariKedepan + hari);
        } else if(sekarang == 2){
            System.out.println(hariIni + "Selasa");
            System.out.println(hariBesok + "Rabu");
            if((nHari % 7) == 1) {
                hari = "Rabu";
            } else if((nHari % 7) == 2) {
                hari = "Kamis";
            } else if((nHari % 7) == 3) {
                hari = "Jum'at";
            } else if((nHari % 7) == 4) {
                hari = "Sabtu";
            } else if((nHari % 7) == 5) {
                hari = "Minggu";
            } else if((nHari % 7) == 6) {
                hari = "Senin";
            } else if((nHari % 7) == 0) {
                hari = "Selasa";
            } System.out.println(nHari + hariKedepan + hari);
        } else if(sekarang == 3){
            System.out.println(hariIni + "Rabu");
            System.out.println(hariBesok + "Kamis");
            if((nHari % 7) == 1) {
                hari = "Kamis";
            } else if((nHari % 7) == 2) {
                hari = "Jum'at";
            } else if((nHari % 7) == 3) {
                hari = "Sabtu";
            } else if((nHari % 7) == 4) {
                hari = "Minggu";
            } else if((nHari % 7) == 5) {
                hari = "Senin";
            } else if((nHari % 7) == 6) {
                hari = "Selasa";
            } else if((nHari % 7) == 0) {
                hari = "Rabu";
            } System.out.println(nHari + hariKedepan + hari);
        } else if(sekarang == 4){
            System.out.println(hariIni + "Kamis");
            System.out.println(hariBesok + "Jum'at");
            if ((nHari % 7) == 1) {
                hari = "Jum'at";
            } else if ((nHari % 7) == 2) {
                hari = "Sabtu";
            } else if ((nHari % 7) == 3) {
                hari = "Minggu";
            }else if ((nHari % 7) == 4) {
                hari = "Senin";
            } else if ((nHari % 7) == 5) {
                hari = "Selasa";
            } else if ((nHari % 7) == 6) {
                hari = "Rabu";
            } else if (nHari % 7 == 7) {
                hari = "Kamis";
            } System.out.println(nHari + hariKedepan + hari);
        } else if(sekarang == 5){
            System.out.println(hariIni + "Jum'at");
            System.out.println(hariBesok + "Sabtu");
            if((nHari % 7) == 1) {
                hari = "Sabtu";
            } else if((nHari % 7) == 2) {
                hari = "Minggu";
            } else if((nHari % 7) == 3) {
                hari = "Senin";
            } else if((nHari % 7) == 4) {
                hari = "Selasa";
            } else if((nHari % 7) == 5) {
                hari = "Rabu";
            } else if((nHari % 7) == 6) {
                hari = "Kamis";
            } else if((nHari % 7) == 0) {
                hari = "Jum'at";
            } System.out.println(nHari + hariKedepan + hari);
        } else if(sekarang == 6){
            System.out.println(hariIni + "Sabtu");
            System.out.println(hariBesok + "Minggu");
            if((nHari % 7) == 1) {
                hari = "Minggu";
            } else if((nHari % 7) == 2) {
                hari = "Senin";
            } else if((nHari % 7) == 3) {
                hari = "Selasa";
            } else if((nHari % 7) == 4) {
                hari = "Rabu";
            } else if((nHari % 7) == 5) {
                hari = "Kamis";
            } else if((nHari % 7) == 6) {
                hari = "Jum'at";
            } else if((nHari % 7) == 0) {
                hari = "Sabtu";
            } System.out.println(nHari + hariKedepan + hari);
        } else if(sekarang == 7){
            System.out.println(hariIni + "Minggu");
            System.out.println(hariBesok + "Senin");
            if((nHari % 7) == 1) {
                hari = "Senin";
            } else if((nHari % 7) == 2) {
                hari = "Selasa";
            } else if((nHari % 7) == 3) {
                hari = "Rabu";
            } else if((nHari % 7) == 4) {
                hari = "Kamis";
            } else if((nHari % 7) == 5) {
                hari = "Jum'at";
            } else if((nHari % 7) == 6) {
                hari = "Sabtu";
            } else if((nHari % 7) == 0) {
                hari = "Minggu";
            } System.out.println(nHari + hariKedepan + hari);
        } else if((sekarang != 1) && (sekarang != 2) && (sekarang != 3) && (sekarang != 4) && (sekarang != 5) && (sekarang != 6) && (sekarang != 7)){
            System.out.println(notValid);
        }

        System.out.println("");
        input.close();
    }

    public static void main (String[] audy) {
        tugasMilik();
        tugasNoTiga();
    }
}