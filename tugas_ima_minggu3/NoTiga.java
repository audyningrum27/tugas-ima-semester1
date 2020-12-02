import java.util.Scanner;
class NoTiga {
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

        switch(sekarang) {
            case 1:
                System.out.println(hariIni + "Senin");
                System.out.println(hariBesok + "Selasa");
                if((nHari == 1) || ((nHari % 7) == 1)) {
                    System.out.println(nHari + hariKedepan + "Selasa");
                }
                if((nHari == 2) || ((nHari % 7) == 2)) {
                    System.out.println(nHari + hariKedepan + "Rabu");
                }
                if((nHari == 3) || ((nHari % 7) == 3)) {
                    System.out.println(nHari + hariKedepan + "Kamis");
                }
                if((nHari == 4) || ((nHari % 7) == 4)) {
                    System.out.println(nHari + hariKedepan + "Jumat");
                }
                if((nHari == 5) || ((nHari % 7) == 5)) {
                    System.out.println(nHari + hariKedepan + "Sabtu");
                }
                if((nHari == 6) || ((nHari % 7) == 6)) {
                    System.out.println(nHari + hariKedepan + "Minggu");
                }
                if((nHari == 7) || (nHari % 7 == 7) || ((nHari % 7) == 0)) {
                    System.out.println(nHari + hariKedepan + "Senin");
                }
                break;
                
            case 2:
                System.out.println(hariIni + "Selasa");
                System.out.println(hariBesok + "Rabu");
                if((nHari == 1) || ((nHari % 7) == 1)) {
                    System.out.println(nHari + hariKedepan + "Rabu");
                }
                if((nHari == 2) || ((nHari % 7) == 2)) {
                    System.out.println(nHari + hariKedepan + "Kamis");
                }
                if((nHari == 3) || ((nHari % 7) == 3)) {
                    System.out.println(nHari + hariKedepan + "Jum'at");
                }
                if((nHari == 4) || ((nHari % 7) == 4)) {
                    System.out.println(nHari + hariKedepan + "Sabtu");
                }
                if((nHari == 5) || ((nHari % 7) == 5)) {
                    System.out.println(nHari + hariKedepan + "Minggu");
                }
                if((nHari == 6) || ((nHari % 7) == 6)) {
                    System.out.println(nHari + hariKedepan + "Senin");
                }
                if((nHari == 7) || (nHari % 7 == 7) || ((nHari % 7) == 0)) {
                    System.out.println(nHari + hariKedepan + "Selasa");
                }
                break;
            
            case 3:
                System.out.println(hariIni + "Rabu");
                System.out.println(hariBesok + "Kamis");
                if((nHari == 1) || ((nHari % 7) == 1)) {
                    System.out.println(nHari + hariKedepan + "Kamis");
                }
                if((nHari == 2) || ((nHari % 7) == 2)) {
                    System.out.println(nHari + hariKedepan + "Jum'at");
                }
                if((nHari == 3) || ((nHari % 7) == 3)) {
                    System.out.println(nHari + hariKedepan + "Sabtu");
                }
                if((nHari == 4) || ((nHari % 7) == 4)) {
                    System.out.println(nHari + hariKedepan + "Minggu");
                }
                if((nHari == 5) || ((nHari % 7) == 5)) {
                    System.out.println(nHari + hariKedepan + "Senin");
                }
                if((nHari == 6) || ((nHari % 7) == 6)) {
                    System.out.println(nHari + hariKedepan + "Selasa");
                }
                if((nHari == 7) || (nHari % 7 == 7) || ((nHari % 7) == 0)) {
                    System.out.println(nHari + hariKedepan + "Rabu");
                }
                break;
                
            case 4:
                System.out.println(hariIni + "Kamis");
                System.out.println(hariBesok + "Jum'at");
                if((nHari == 1) || ((nHari % 7) == 1)) {
                    System.out.println(nHari + hariKedepan + "Jum'at");
                }
                if((nHari == 2) || ((nHari % 7) == 2)) {
                    System.out.println(nHari + hariKedepan + "Sabtu");
                }
                if((nHari == 3) || ((nHari % 7) == 3)) {
                    System.out.println(nHari + hariKedepan + "Minggu");
                }
                if((nHari == 4) || ((nHari % 7) == 4)) {
                    System.out.println(nHari + hariKedepan + "Senin");
                }
                if((nHari == 5) || ((nHari % 7) == 5)) {
                    System.out.println(nHari + hariKedepan + "Selasa");
                }
                if((nHari == 6) || ((nHari % 7) == 6)) {
                    System.out.println(nHari + hariKedepan + "Rabu");
                }
                if((nHari == 7) || (nHari % 7 == 7) || ((nHari % 7) == 0)) {
                    System.out.println(nHari + hariKedepan + "Kamis");
                }
                break;
            
            case 5:
                System.out.println(hariIni + "Jum'at");
                System.out.println(hariBesok + "Sabtu");
                if((nHari == 1) || ((nHari % 7) == 1)) {
                    System.out.println(nHari + hariKedepan + "Sabtu");
                }
                if((nHari == 2) || ((nHari % 7) == 2)) {
                    System.out.println(nHari + hariKedepan + "Minggu");
                }
                if((nHari == 3) || ((nHari % 7) == 3)) {
                    System.out.println(nHari + hariKedepan + "Senin");
                }
                if((nHari == 4) || ((nHari % 7) == 4)) {
                    System.out.println(nHari + hariKedepan + "Selasa");
                }
                if((nHari == 5) || ((nHari % 7) == 5)) {
                    System.out.println(nHari + hariKedepan + "Rabu");
                }
                if((nHari == 6) || ((nHari % 7) == 6)) {
                    System.out.println(nHari + hariKedepan + "Kamis");
                }
                if((nHari == 7) || (nHari % 7 == 7) || ((nHari % 7) == 0)) {
                    System.out.println(nHari + hariKedepan + "Jum'at");
                }
                break;
                
            case 6:
                System.out.println(hariIni + "Sabtu");
                System.out.println(hariBesok + "Minggu");
                if((nHari == 1) || ((nHari % 7) == 1)) {
                    System.out.println(nHari + hariKedepan + "Minggu");
                }
                if((nHari == 2) || ((nHari % 7) == 2)) {
                    System.out.println(nHari + hariKedepan + "Senin");
                }
                if((nHari == 3) || ((nHari % 7) == 3)) {
                    System.out.println(nHari + hariKedepan + "Selasa");
                }
                if((nHari == 4) || ((nHari % 7) == 4)) {
                    System.out.println(nHari + hariKedepan + "Rabu");
                }
                if((nHari == 5) || ((nHari % 7) == 5)) {
                    System.out.println(nHari + hariKedepan + "Kamis");
                }
                if((nHari == 6) || ((nHari % 7) == 6)) {
                    System.out.println(nHari + hariKedepan + "Jum'at");
                }
                if((nHari == 7) || (nHari % 7 == 7) || ((nHari % 7) == 0)) {
                    System.out.println(nHari + hariKedepan + "Sabtu");
                }
                break;
            
            case 7:
                System.out.println(hariIni + "Minggu");
                System.out.println(hariBesok + "Senin");
                if((nHari == 1) || ((nHari % 7) == 1)) {
                    System.out.println(nHari + hariKedepan + "Senin");
                }
                if((nHari == 2) || ((nHari % 7) == 2)) {
                    System.out.println(nHari + hariKedepan + "Selasa");
                }
                if((nHari == 3) || ((nHari % 7) == 3)) {
                    System.out.println(nHari + hariKedepan + "Rabu");
                }
                if((nHari == 4) || ((nHari % 7) == 4)) {
                    System.out.println(nHari + hariKedepan + "Kamis");
                }
                if((nHari == 5) || ((nHari % 7) == 5)) {
                    System.out.println(nHari + hariKedepan + "Jum'at");
                }
                if((nHari == 6) || ((nHari % 7) == 6)) {
                    System.out.println(nHari + hariKedepan + "Sabtu");
                }
                if((nHari == 7) || (nHari % 7 == 7) || ((nHari % 7) == 0)) {
                    System.out.println(nHari + hariKedepan + "Minggu");
                }
                break;
                
            default:
                System.out.println(notValid);
                break;
        }

        System.out.println("");
        input.close();
    }

    public static void main (String[] audy) {
        tugasMilik();
        tugasNoTiga();
    }
}