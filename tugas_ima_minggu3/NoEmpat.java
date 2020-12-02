import java.util.Scanner;

class empat {
    public static void tugasMilik() {
        String nama, kelas, tugas;
        nama = "Nurul Qofifah Audyningrum";
        kelas = "D3IF-44-01";
        long nim = 6706202013L;
        tugas = "Next date";
        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("-------------------------------");
        System.out.println("Tugas No.4 : " + tugas);
        System.out.println("");
    }

    public static void tugasNoEmpat() {
        Scanner input = new Scanner (System.in);

        System.out.print("Tahun : ");
        int tahun = input.nextInt();

        System.out.print("Bulan : ");
        int bulan = input.nextInt();

        System.out.print("Tanggal : ");
        int tanggal = input.nextInt();

        System.out.print("N hari kedepan : ");
        int nHari = input.nextInt();

        System.out.println("-------------------------------");
        
        String sekarang = "Hari ini tanggal : ";
        String besok = "Besok tanggal : ";
        String kedepan = " hari lagi tanggal : ";
        String notValid = "Inputan tidak valid";
        int jmlHari = tanggal + nHari;
        int tglBesok = tanggal + 1;
        int hari;
        
        if(bulan == 1){
            System.out.println("Januari memiliki hari sebanyak 31");

            // Hari ini tanggal //
            if (tanggal <= 31) {
                System.out.println(sekarang + tanggal + " Januari " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 31;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " Januari " + tahun);
            } else if (tglBesok == 32) {
                System.out.println(besok + "1 Februari " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N hari lagi tanggal //
            if (jmlHari <= 31) {
                System.out.println(nHari + kedepan + jmlHari + " Januari " + tahun);
            } else if (tahun % 400 == 0) {
                if ((jmlHari > 31) && (jmlHari <= 60)) {
                    System.out.println(nHari + kedepan + (jmlHari - 31) + " Februari " + tahun);
                } else if ((jmlHari > 60) && (jmlHari <= 91)) {
                    System.out.println(nHari + kedepan + (jmlHari - 60) + " Maret " + tahun);
                } else if ((jmlHari > 91) && (jmlHari <= 121)) {
                    System.out.println(nHari + kedepan + (jmlHari - 91) + " April " + tahun);
                } else if ((jmlHari > 121) && (jmlHari <= 152)) {
                    System.out.println(nHari + kedepan + (jmlHari - 121) + " Mei " + tahun);
                } else if ((jmlHari > 152) && (jmlHari <= 182)) {
                    System.out.println(nHari + kedepan + (jmlHari - 152) + " Juni " + tahun);
                } else if ((jmlHari > 182) && (jmlHari <= 213)) {
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Juli " + tahun);
                } else if ((jmlHari > 213) && (jmlHari <= 244)) {
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Agustus " + tahun);
                } else if ((jmlHari > 244) && (jmlHari <= 274)) {
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " September " + tahun);
                } else if ((jmlHari > 274) && (jmlHari <= 305)) {
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Oktober " + tahun);
                } else if ((jmlHari > 305) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " November " + tahun);
                } else if ((jmlHari > 335) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Desember " + tahun);
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 31) && (jmlHari <= 59)) {
                    System.out.println(nHari + kedepan + (jmlHari - 31) + " Februari " + tahun);
                } else if ((jmlHari > 59) && (jmlHari <= 90)) {
                    System.out.println(nHari + kedepan + (jmlHari - 59) + " Maret " + tahun);
                } else if ((jmlHari > 90) && (jmlHari <= 120)) {
                    System.out.println(nHari + kedepan + (jmlHari - 90) + " April " + tahun);
                } else if ((jmlHari > 120) && (jmlHari <= 151)) {
                    System.out.println(nHari + kedepan + (jmlHari - 120) + " Mei " + tahun);
                } else if ((jmlHari > 151) && (jmlHari <= 181)) {
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " Juni " + tahun);
                } else if ((jmlHari > 181) && (jmlHari <= 212)) {
                    System.out.println(nHari + kedepan + (jmlHari - 181) + " Juli " + tahun);
                } else if ((jmlHari > 212) && (jmlHari <= 243)) {
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Agustus " + tahun);
                } else if ((jmlHari > 243) && (jmlHari <= 273)) {
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " September " + tahun);
                } else if ((jmlHari > 273) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Oktober " + tahun);
                } else if ((jmlHari > 304) && (jmlHari <= 334)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " November " + tahun);
                } else if ((jmlHari > 334) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Desember " + tahun);
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if ((jmlHari > 31) && (jmlHari <= 60)) {
                    System.out.println(nHari + kedepan + (jmlHari - 31) + " Februari " + tahun);
                } else if ((jmlHari > 60) && (jmlHari <= 91)) {
                    System.out.println(nHari + kedepan + (jmlHari - 60) + " Maret " + tahun);
                } else if ((jmlHari > 91) && (jmlHari <= 121)) {
                    System.out.println(nHari + kedepan + (jmlHari - 91) + " April " + tahun);
                } else if ((jmlHari > 121) && (jmlHari <= 152)) {
                    System.out.println(nHari + kedepan + (jmlHari - 121) + " Mei " + tahun);
                } else if ((jmlHari > 152) && (jmlHari <= 182)) {
                    System.out.println(nHari + kedepan + (jmlHari - 152) + " Juni " + tahun);
                } else if ((jmlHari > 182) && (jmlHari <= 213)) {
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Juli " + tahun);
                } else if ((jmlHari > 213) && (jmlHari <= 244)) {
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Agustus " + tahun);
                } else if ((jmlHari > 244) && (jmlHari <= 274)) {
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " September " + tahun);
                } else if ((jmlHari > 274) && (jmlHari <= 305)) {
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Oktober " + tahun);
                } else if ((jmlHari > 305) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " November " + tahun);
                } else if ((jmlHari > 335) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Desember " + tahun);
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 31) && (jmlHari <= 59)) {
                    System.out.println(nHari + kedepan + (jmlHari - 31) + " Februari " + tahun);
                } else if ((jmlHari > 59) && (jmlHari <= 90)) {
                    System.out.println(nHari + kedepan + (jmlHari - 59) + " Maret " + tahun);
                } else if ((jmlHari > 90) && (jmlHari <= 120)) {
                    System.out.println(nHari + kedepan + (jmlHari - 90) + " April " + tahun);
                } else if ((jmlHari > 120) && (jmlHari <= 151)) {
                    System.out.println(nHari + kedepan + (jmlHari - 120) + " Mei " + tahun);
                } else if ((jmlHari > 151) && (jmlHari <= 181)) {
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " Juni " + tahun);
                } else if ((jmlHari > 181) && (jmlHari <= 212)) {
                    System.out.println(nHari + kedepan + (jmlHari - 181) + " Juli " + tahun);
                } else if ((jmlHari > 212) && (jmlHari <= 243)) {
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Agustus " + tahun);
                } else if ((jmlHari > 243) && (jmlHari <= 273)) {
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " September " + tahun);
                } else if ((jmlHari > 273) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Oktober " + tahun);
                } else if ((jmlHari > 304) && (jmlHari <= 334)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " November " + tahun);
                } else if ((jmlHari > 334) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Desember " + tahun);
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
            
        }

        if(bulan == 2){
            if (tahun % 400 == 0) {
                System.out.println("Februari memiliki hari sebanyak 29");

                // Hari ini tanggal //
                if (tanggal <= 29) {
                    System.out.println(sekarang + tanggal + " Februari " + tahun);
                } else {
                    System.out.println(notValid);
                }
            
                // Besok tanggal //
                hari = 29;
                if (tglBesok <= hari){
                    System.out.println(besok + tglBesok + " Februari " + tahun);
                } else if (tglBesok == 30) {
                    System.out.println(besok + "1 Maret " + tahun);
                } else {
                    System.out.println(notValid);
                }

                // N hari lagi tanggal //
                if (jmlHari <= 29) {
                    System.out.println(nHari + kedepan + jmlHari + " Februari " + tahun);
                } else if ((jmlHari > 29) && (jmlHari <= 60)) {
                    System.out.println(nHari + kedepan + (jmlHari - 29) + " Maret " + tahun);
                } else if ((jmlHari > 60) && (jmlHari <= 90)) {
                    System.out.println(nHari + kedepan + (jmlHari - 60) + " April " + tahun);
                } else if ((jmlHari > 90) && (jmlHari <= 121)) {
                    System.out.println(nHari + kedepan + (jmlHari - 90) + " Mei " + tahun);
                } else if ((jmlHari > 121) && (jmlHari <= 151)) {
                    System.out.println(nHari + kedepan + (jmlHari - 121) + " Juni " + tahun);
                } else if ((jmlHari > 151) && (jmlHari <= 182)) {
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " Juli " + tahun);
                } else if ((jmlHari > 182) && (jmlHari <= 213)) {
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Agustus " + tahun);
                }  else if ((jmlHari > 213) && (jmlHari <= 243)) {
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " September " + tahun);
                } else if ((jmlHari > 243) && (jmlHari <= 274)) {
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Oktober " + tahun);
                } else if ((jmlHari > 274) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " November " + tahun);
                } else if ((jmlHari > 304) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Desember " + tahun);
                } else if ((jmlHari > 335) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Januari " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
    
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                System.out.println("Februari memiliki hari sebanyak 28");
                
                // Hari ini tanggal //
                if (tanggal <= 28) {
                    System.out.println(sekarang + tanggal + " Februari " + tahun);
                } else {
                    System.out.println(notValid);
                }
            
                // Besok tanggal //
                hari = 28;
                if (tglBesok <= hari){
                    System.out.println(besok + tglBesok + " Februari " + tahun);
                } else if (tglBesok == 29) {
                    System.out.println(besok + "1 Maret " + tahun);
                } else {
                    System.out.println(notValid);
                }

                // N hari lagi tanggal //
                if (jmlHari <= 28) {
                    System.out.println(nHari + kedepan + jmlHari + " Februari " + tahun);
                } else if ((jmlHari > 28) && (jmlHari <= 59)) {
                    System.out.println(nHari + kedepan + (jmlHari - 28) + " Maret " + tahun);
                } else if ((jmlHari > 59) && (jmlHari <= 89)) {
                    System.out.println(nHari + kedepan + (jmlHari - 59) + " April " + tahun);
                } else if ((jmlHari > 89) && (jmlHari <= 120)) {
                    System.out.println(nHari + kedepan + (jmlHari - 89) + " Mei " + tahun);
                } else if ((jmlHari > 120) && (jmlHari <= 150)) {
                    System.out.println(nHari + kedepan + (jmlHari - 120) + " Juni " + tahun);
                } else if ((jmlHari > 150) && (jmlHari <= 181)) {
                    System.out.println(nHari + kedepan + (jmlHari - 150) + " Juli " + tahun);
                } else if ((jmlHari > 181) && (jmlHari <= 212)) {
                    System.out.println(nHari + kedepan + (jmlHari - 181) + " Agustus " + tahun);
                }  else if ((jmlHari > 212) && (jmlHari <= 242)) {
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " September " + tahun);
                } else if ((jmlHari > 242) && (jmlHari <= 273)) {
                    System.out.println(nHari + kedepan + (jmlHari - 242) + " Oktober " + tahun);
                } else if ((jmlHari > 273) && (jmlHari <= 303)) {
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " November " + tahun);
                } else if ((jmlHari > 303) && (jmlHari <= 334)) {
                    System.out.println(nHari + kedepan + (jmlHari - 303) + " Desember " + tahun);
                } else if ((jmlHari > 334) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Januari " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
    
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                System.out.println("Februari memiliki hari sebanyak 29");

                // Hari ini tanggal //
                if (tanggal <= 29) {
                    System.out.println(sekarang + tanggal + " Februari " + tahun);
                } else {
                    System.out.println(notValid);
                }
            
                // Besok tanggal //
                hari = 29;
                if (tglBesok <= hari){
                    System.out.println(besok + tglBesok + " Februari " + tahun);
                } else if (tglBesok == 30) {
                    System.out.println(besok + "1 Maret " + tahun);
                } else {
                    System.out.println(notValid);
                }

                // N hari lagi tanggal //
                if (jmlHari <= 29) {
                    System.out.println(nHari + jmlHari + " Februari " + tahun);
                } else if ((jmlHari > 29) && (jmlHari <= 60)) {
                    System.out.println(nHari + kedepan + (jmlHari - 29) + " Maret " + tahun);
                } else if ((jmlHari > 60) && (jmlHari <= 90)) {
                    System.out.println(nHari + kedepan + (jmlHari - 60) + " April " + tahun);
                } else if ((jmlHari > 90) && (jmlHari <= 121)) {
                    System.out.println(nHari + kedepan + (jmlHari - 90) + " Mei " + tahun);
                } else if ((jmlHari > 121) && (jmlHari <= 151)) {
                    System.out.println(nHari + kedepan + (jmlHari - 121) + " Juni " + tahun);
                } else if ((jmlHari > 151) && (jmlHari <= 182)) {
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " Juli " + tahun);
                } else if ((jmlHari > 182) && (jmlHari <= 213)) {
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Agustus " + tahun);
                }  else if ((jmlHari > 213) && (jmlHari <= 243)) {
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " September " + tahun);
                } else if ((jmlHari > 243) && (jmlHari <= 274)) {
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Oktober " + tahun);
                } else if ((jmlHari > 274) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " November " + tahun);
                } else if ((jmlHari > 304) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Desember " + tahun);
                } else if ((jmlHari > 335) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Januari " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
    
            } else {
                System.out.println("Februari memiliki hari sebanyak 28");
                
                // Hari ini tanggal //
                if (tanggal <= 28) {
                    System.out.println(sekarang + tanggal + " Februari " + tahun);
                } else {
                    System.out.println(notValid);
                }
            
                // Besok tanggal //
                hari = 28;
                if (tglBesok <= hari){
                    System.out.println(besok + tglBesok + " Januari " + tahun);
                } else if (tglBesok == 29) {
                    System.out.println(besok + "1 Februari " + tahun);
                } else {
                    System.out.println(notValid);
                }

                // N hari lagi tanggal //
                if (jmlHari <= 28) {
                    System.out.println(nHari + kedepan + jmlHari + " Februari " + tahun);
                } else if ((jmlHari > 28) && (jmlHari <= 59)) {
                    System.out.println(nHari + kedepan + (jmlHari - 28) + " Maret " + tahun);
                } else if ((jmlHari > 59) && (jmlHari <= 89)) {
                    System.out.println(nHari + kedepan + (jmlHari - 59) + " April " + tahun);
                } else if ((jmlHari > 89) && (jmlHari <= 120)) {
                    System.out.println(nHari + kedepan + (jmlHari - 89) + " Mei " + tahun);
                } else if ((jmlHari > 120) && (jmlHari <= 150)) {
                    System.out.println(nHari + kedepan + (jmlHari - 120) + " Juni " + tahun);
                } else if ((jmlHari > 150) && (jmlHari <= 181)) {
                    System.out.println(nHari + kedepan + (jmlHari - 150) + " Juli " + tahun);
                } else if ((jmlHari > 181) && (jmlHari <= 212)) {
                    System.out.println(nHari + kedepan + (jmlHari - 181) + " Agustus " + tahun);
                }  else if ((jmlHari > 212) && (jmlHari <= 242)) {
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " September " + tahun);
                } else if ((jmlHari > 242) && (jmlHari <= 273)) {
                    System.out.println(nHari + kedepan + (jmlHari - 242) + " Oktober " + tahun);
                } else if ((jmlHari > 273) && (jmlHari <= 303)) {
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " November " + tahun);
                } else if ((jmlHari > 303) && (jmlHari <= 334)) {
                    System.out.println(nHari + kedepan + (jmlHari - 303) + " Desember " + tahun);
                } else if ((jmlHari > 334) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Januari " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
    
            }
            
        }

        if(bulan == 3){
            System.out.println("Maret memiliki hari sebanyak 31");

            // Hari ini tanggal //
            if (tanggal <= 31) {
                System.out.println(sekarang + tanggal + " Maret " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 31;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " Maret " + tahun);
            } else if (tglBesok == 32) {
                System.out.println(besok + "1 April " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N hari lagi tanggal //
            if (jmlHari <= 31) {
                System.out.println(nHari + kedepan + jmlHari + " Maret " + tahun);
            } else if ((jmlHari > 31) && (jmlHari <= 61)) {
                System.out.println(nHari + kedepan + (jmlHari - 31) + " April " + tahun);
            } else if ((jmlHari > 61) && (jmlHari <= 92)) {
                System.out.println(nHari + kedepan + (jmlHari - 61) + " Mei " + tahun);
            } else if ((jmlHari > 92) && (jmlHari <= 122)) {
                System.out.println(nHari + kedepan + (jmlHari - 92) + " Juni " + tahun);
            } else if ((jmlHari > 122) && (jmlHari <= 153)) {
                System.out.println(nHari + kedepan + (jmlHari - 122) + " Juli " + tahun);
            } else if ((jmlHari > 153) && (jmlHari <= 183)) {
                System.out.println(nHari + kedepan + (jmlHari - 153) + " Agustus " + tahun);
            } else if ((jmlHari > 184) && (jmlHari <= 214)) {
                System.out.println(nHari + kedepan + (jmlHari - 184) + " September " + tahun);
            } else if ((jmlHari > 214) && (jmlHari <= 245)) {
                System.out.println(nHari + kedepan + (jmlHari - 214) + " September " + tahun);
            } else if ((jmlHari > 245) && (jmlHari <= 275)) {
                System.out.println(nHari + kedepan + (jmlHari - 245) + " November " + tahun);
            } else if ((jmlHari > 275) && (jmlHari <= 306)) {
                System.out.println(nHari + kedepan + (jmlHari - 274) + " Desember " + tahun);
            } else if ((jmlHari > 306) && (jmlHari <= 337)) {
                System.out.println(nHari + kedepan + (jmlHari - 306) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 337) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 338) + " Februari " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 337) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " Februari " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 337) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 338) + " Februari " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 337) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " Februari " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if(bulan == 4){
            System.out.println("April memiliki hari sebanyak 30");
            
            // Hari ini tanggal //
            if (tanggal <= 30) {
                System.out.println(sekarang + tanggal + " April " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 30;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " April " + tahun);
            } else if (tglBesok == 31) {
                System.out.println(besok + "1 Mei " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N Hari lagi tanggal //
            if (jmlHari <= 30) {
                System.out.println(nHari + kedepan + jmlHari + " April " + tahun);
            } else if ((jmlHari > 30) && (jmlHari <= 61)) {
                System.out.println(nHari + kedepan + (jmlHari - 30) + " Mei " + tahun);
            } else if ((jmlHari > 61) && (jmlHari <= 91)) {
                System.out.println(nHari + kedepan + (jmlHari - 61) + " Juni " + tahun);
            } else if ((jmlHari > 91) && (jmlHari <= 122)) {
                System.out.println(nHari + kedepan + (jmlHari - 91) + " Juli " + tahun);
            } else if ((jmlHari > 122) && (jmlHari <= 153)) {
                System.out.println(nHari + kedepan + (jmlHari - 122) + " Agustus " + tahun);
            } else if ((jmlHari > 153) && (jmlHari <= 183)) {
                System.out.println(nHari + kedepan + (jmlHari - 153) + " September " + tahun);
            } else if ((jmlHari > 183) && (jmlHari <= 214)) {
                System.out.println(nHari + kedepan + (jmlHari - 183) + " Oktober " + tahun);
            } else if ((jmlHari > 214) && (jmlHari <= 244)) {
                System.out.println(nHari + kedepan + (jmlHari - 214) + " November " + tahun);
            } else if ((jmlHari > 244) && (jmlHari <= 275)) {
                System.out.println(nHari + kedepan + (jmlHari - 244) + " Desember " + tahun);
            } else if ((jmlHari > 275) && (jmlHari <= 306)) {
                System.out.println(nHari + kedepan + (jmlHari - 275) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 306) && (jmlHari <= 334)) {
                    System.out.println(nHari + kedepan + (jmlHari - 306) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 334) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Maret " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 306) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 306) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 335) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Maret " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 306) && (jmlHari <= 334)) {
                    System.out.println(nHari + kedepan + (jmlHari - 306) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 334) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Maret " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 306) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 306) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 335) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Maret " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if(bulan == 5){
            System.out.println("Mei memiliki hari sebanyak 31");            
            
            // Hari ini tanggal //
            if (tanggal <= 31) {
                System.out.println(sekarang + tanggal + " Mei " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 31;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " Mei " + tahun);
            } else if (tglBesok == 32) {
                System.out.println(besok + "1 Juni " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N Hari lagi tanggal //
            if (jmlHari <= 31) {
                System.out.println(nHari + kedepan + jmlHari + " Mei " + tahun);
            } else if ((jmlHari > 31) && (jmlHari <= 61)) {
                System.out.println(nHari + kedepan + (jmlHari - 31) + " Juni " + tahun);
            } else if ((jmlHari > 61) && (jmlHari <= 92)) {
                System.out.println(nHari + kedepan + (jmlHari - 61) + " Juli " + tahun);
            } else if ((jmlHari > 92) && (jmlHari <= 123)) {
                System.out.println(nHari + kedepan + (jmlHari - 92) + " Agustus " + tahun);
            } else if ((jmlHari > 123) && (jmlHari <= 153)) {
                System.out.println(nHari + kedepan + (jmlHari - 123) + " September " + tahun);
            } else if ((jmlHari > 153) && (jmlHari <= 184)) {
                System.out.println(nHari + kedepan + (jmlHari - 153) + " Oktober " + tahun);
            } else if ((jmlHari > 184) && (jmlHari <= 214)) {
                System.out.println(nHari + kedepan + (jmlHari - 184) + " November " + tahun);
            } else if ((jmlHari > 214) && (jmlHari <= 245)) {
                System.out.println(nHari + kedepan + (jmlHari - 214) + " Desember " + tahun);
            } else if ((jmlHari > 245) && (jmlHari <= 276)) {
                System.out.println(nHari + kedepan + (jmlHari - 245) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 276) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 276) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 304) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 335) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " April " + (tahun + 1));                    
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 275) && (jmlHari <= 305)) {
                    System.out.println(nHari + kedepan + (jmlHari - 275) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 305) && (jmlHari <= 336)) {
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 336) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " April " + (tahun + 1));                    
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 276) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 276) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 304) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 335) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " April " + (tahun + 1));                    
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 275) && (jmlHari <= 305)) {
                    System.out.println(nHari + kedepan + (jmlHari - 275) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 305) && (jmlHari <= 336)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 336) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " April " + (tahun + 1));                    
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if(bulan == 6){
            System.out.println("Juni memiliki hari sebanyak 30");
            
            // Hari ini tanggal //
            if (tanggal <= 30) {
                System.out.println(sekarang + tanggal + " Juni " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 30;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " Juni " + tahun);
            } else if (tglBesok == 31) {
                System.out.println(besok + "1 Juli " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N Hari lagi tanggal //
            if (jmlHari <= 30) {
                System.out.println(nHari + kedepan + jmlHari + " Juni " + tahun);
            } else if ((jmlHari > 30) && (jmlHari <= 61)) {
                System.out.println(nHari + kedepan + (jmlHari - 30) + " Juli " + tahun);
            } else if ((jmlHari > 61) && (jmlHari <= 92)) {
                System.out.println(nHari + kedepan + (jmlHari - 61) + " Agustus " + tahun);
            } else if ((jmlHari > 92) && (jmlHari <= 122)) {
                System.out.println(nHari + kedepan + (jmlHari - 92) + " September " + tahun);
            } else if ((jmlHari > 122) && (jmlHari <= 153)) {
                System.out.println(nHari + kedepan + (jmlHari - 122) + " Oktober " + tahun);
            } else if ((jmlHari > 153) && (jmlHari <= 183)) {
                System.out.println(nHari + kedepan + (jmlHari - 153) + " November " + tahun);
            } else if ((jmlHari > 183) && (jmlHari <= 214)) {
                System.out.println(nHari + kedepan + (jmlHari - 183) + " Desember " + tahun);
            } else if ((jmlHari > 214) && (jmlHari <= 245)) {
                System.out.println(nHari + kedepan + (jmlHari - 214) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 245) && (jmlHari <= 273)) {
                    System.out.println(nHari + kedepan + (jmlHari - 245) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 273) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 304) && (jmlHari <= 334)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 334) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Mei " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 245) && (jmlHari <= 274)) {
                    System.out.println(nHari + kedepan + (jmlHari - 245) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 274) && (jmlHari <= 305)) {
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 305) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 335) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Mei " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 245) && (jmlHari <= 273)) {
                    System.out.println(nHari + kedepan + (jmlHari - 245) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 273) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 304) && (jmlHari <= 334)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 334) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Mei " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 245) && (jmlHari <= 274)) {
                    System.out.println(nHari + kedepan + (jmlHari - 245) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 274) && (jmlHari <= 305)) {
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 305) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 335) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Mei " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if(bulan == 7){
            System.out.println("Juli memiliki hari sebanyak 31");
            
            // Hari ini tanggal //
            if (tanggal <= 31) {
                System.out.println(sekarang + tanggal + " Juli " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 31;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " Juli " + tahun);
            } else if (tglBesok == 32) {
                System.out.println(besok + "1 Agustus " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N Hari lagi tanggal //
            if (jmlHari <= 31) {
                System.out.println(nHari + kedepan + jmlHari + " Juli " + tahun);
            } else if ((jmlHari > 31) && (jmlHari <= 62)) {
                System.out.println(nHari + kedepan + (jmlHari - 30) + " Agustus " + tahun);
            } else if ((jmlHari > 62) && (jmlHari <= 92)) {
                System.out.println(nHari + kedepan + (jmlHari - 62) + " September " + tahun);
            } else if ((jmlHari > 92) && (jmlHari <= 123)) {
                System.out.println(nHari + kedepan + (jmlHari - 92) + " Oktober " + tahun);
            } else if ((jmlHari > 123) && (jmlHari <= 153)) {
                System.out.println(nHari + kedepan + (jmlHari - 123) + " November " + tahun);
            } else if ((jmlHari > 153) && (jmlHari <= 184)) {
                System.out.println(nHari + kedepan + (jmlHari - 153) + " Desember " + tahun);
            } else if ((jmlHari > 184) && (jmlHari <= 215)) {
                System.out.println(nHari + kedepan + (jmlHari - 184) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 215) && (jmlHari <= 243)) {
                    System.out.println(nHari + kedepan + (jmlHari - 215) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 243) && (jmlHari <= 274)) {
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 274) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 304) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 335) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Juni " + (tahun + 1)); 
                }else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 215) && (jmlHari <= 244)) {
                    System.out.println(nHari + kedepan + (jmlHari - 215) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 244) && (jmlHari <= 275)) {
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 275) && (jmlHari <= 305)){
                    System.out.println(nHari + kedepan + (jmlHari - 275) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 306) && (jmlHari <= 336)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 336) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " Juni " + (tahun + 1)); 
                }else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 215) && (jmlHari <= 243)) {
                    System.out.println(nHari + kedepan + (jmlHari - 215) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 243) && (jmlHari <= 274)) {
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 274) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 304) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 335) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Juni " + (tahun + 1)); 
                }else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 215) && (jmlHari <= 244)) {
                    System.out.println(nHari + kedepan + (jmlHari - 215) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 244) && (jmlHari <= 275)) {
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 275) && (jmlHari <= 305)){
                    System.out.println(nHari + kedepan + (jmlHari - 275) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 306) && (jmlHari <= 336)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 336) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " Juni " + (tahun + 1)); 
                }else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if(bulan == 8){
            System.out.println("Agustus memiliki hari sebanyak 31");
            
            // Hari ini tanggal //
            if (tanggal <= 31) {
                System.out.println(sekarang + tanggal + " Agustus " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 31;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " Agustus " + tahun);
            } else if (tglBesok == 32) {
                System.out.println(besok + "1 September " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N Hari lagi tanggal //
            if (jmlHari <= 31) {
                System.out.println(nHari + kedepan + jmlHari + " Agustus " + tahun);
            } else if ((jmlHari > 31) && (jmlHari <= 61)) {
                System.out.println(nHari + kedepan + (jmlHari - 31) + " September " + tahun);
            } else if ((jmlHari > 61) && (jmlHari <= 92)) {
                System.out.println(nHari + kedepan + (jmlHari - 61) + " Oktober " + tahun);
            } else if ((jmlHari > 92) && (jmlHari <= 122)) {
                System.out.println(nHari + kedepan + (jmlHari - 92) + " November " + tahun);
            } else if ((jmlHari > 122) && (jmlHari <= 153)) {
                System.out.println(nHari + kedepan + (jmlHari - 122) + " Desember " + tahun);
            } else if ((jmlHari > 153) && (jmlHari <= 184)) {
                System.out.println(nHari + kedepan + (jmlHari - 153) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 184) && (jmlHari <= 212)) {
                    System.out.println(nHari + kedepan + (jmlHari - 184) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 212) && (jmlHari <= 243)) {
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 243) && (jmlHari <= 273)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 273) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 304) && (jmlHari <= 334)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 334) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Juli " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 184) && (jmlHari <= 213)) {
                    System.out.println(nHari + kedepan + (jmlHari - 184) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 213) && (jmlHari <= 244)) {
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 244) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 274) && (jmlHari <= 305)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 305) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 335) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Juli " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 184) && (jmlHari <= 212)) {
                    System.out.println(nHari + kedepan + (jmlHari - 184) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 212) && (jmlHari <= 243)) {
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 243) && (jmlHari <= 273)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 273) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 304) && (jmlHari <= 334)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 334) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Juli " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 184) && (jmlHari <= 213)) {
                    System.out.println(nHari + kedepan + (jmlHari - 184) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 213) && (jmlHari <= 244)) {
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 244) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 274) && (jmlHari <= 305)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 305) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 335) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Juli " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if(bulan == 9){
            System.out.println("September memiliki hari sebanyak 30");
            
            // Hari ini tanggal //
            if (tanggal <= 30) {
                System.out.println(sekarang + tanggal + " September " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 30;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " September " + tahun);
            } else if (tglBesok == 31) {
                System.out.println(besok + "1 Oktober " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N Hari lagi tanggal //
            if (jmlHari <= 30) {
                System.out.println(nHari + kedepan + jmlHari + " September " + tahun);
            } else if ((jmlHari > 30) && (jmlHari <= 61)) {
                System.out.println(nHari + kedepan + (jmlHari - 30) + " Oktober " + tahun);
            } else if ((jmlHari > 61) && (jmlHari <= 91)) {
                System.out.println(nHari + kedepan + (jmlHari - 61) + " November " + tahun);
            } else if ((jmlHari > 91) && (jmlHari <= 122)) {
                System.out.println(nHari + kedepan + (jmlHari - 91) + " Desember " + tahun);
            } else if ((jmlHari > 122) && (jmlHari <= 153)) {
                System.out.println(nHari + kedepan + (jmlHari - 122) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 153) && (jmlHari <= 181)) {
                    System.out.println(nHari + kedepan + (jmlHari - 153) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 181) && (jmlHari <= 212)) {
                    System.out.println(nHari + kedepan + (jmlHari - 181) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 212) && (jmlHari <= 242)){
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 242) && (jmlHari <= 273)){
                    System.out.println(nHari + kedepan + (jmlHari - 242) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 273) && (jmlHari <= 303)){
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 303) && (jmlHari <= 334)){
                    System.out.println(nHari + kedepan + (jmlHari - 303) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 334) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Agustus " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 153) && (jmlHari <= 182)) {
                    System.out.println(nHari + kedepan + (jmlHari - 153) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 182) && (jmlHari <= 213)) {
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 213) && (jmlHari <= 243)){
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 243) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 274) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 304) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 335) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Agustus " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 153) && (jmlHari <= 181)) {
                    System.out.println(nHari + kedepan + (jmlHari - 153) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 181) && (jmlHari <= 212)) {
                    System.out.println(nHari + kedepan + (jmlHari - 181) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 212) && (jmlHari <= 242)){
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 242) && (jmlHari <= 273)){
                    System.out.println(nHari + kedepan + (jmlHari - 242) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 273) && (jmlHari <= 303)){
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 303) && (jmlHari <= 334)){
                    System.out.println(nHari + kedepan + (jmlHari - 303) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 334) && (jmlHari <= 365)){
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Agustus " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 153) && (jmlHari <= 182)) {
                    System.out.println(nHari + kedepan + (jmlHari - 153) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 182) && (jmlHari <= 213)) {
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 213) && (jmlHari <= 243)){
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 243) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 274) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 304) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 335) && (jmlHari <= 366)){
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Agustus " + (tahun + 1)); 
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if(bulan == 10){
            System.out.println("Oktober memiliki hari sebanyak 31");
            
            // Hari ini tanggal //
            if (tanggal <= 31) {
                System.out.println(sekarang + tanggal + " Oktober " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 31;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " Oktober " + tahun);
            } else if (tglBesok == 32) {
                System.out.println(besok + "1 November " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N Hari lagi tanggal //
            if (jmlHari <= 31) {
                System.out.println(nHari + kedepan + jmlHari + " Oktober " + tahun);
            } else if ((jmlHari > 31) && (jmlHari <= 61)) {
                System.out.println(nHari + kedepan + (jmlHari - 31) + " November " + tahun);
            } else if ((jmlHari > 61) && (jmlHari <= 92)) {
                System.out.println(nHari + kedepan + (jmlHari - 61) + " Desember " + tahun);
            } else if ((jmlHari > 92) && (jmlHari <= 123)) {
                System.out.println(nHari + kedepan + (jmlHari - 92) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 123) && (jmlHari <= 151)) {
                    System.out.println(nHari + kedepan + (jmlHari - 123) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 151) && (jmlHari <= 182)) {
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 182) && (jmlHari <= 212)){
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 212) && (jmlHari <= 243)){
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 243) && (jmlHari <= 273)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 273) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 304) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 335) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " September " + (tahun + 1));
                }else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 123) && (jmlHari <= 152)) {
                    System.out.println(nHari + kedepan + (jmlHari - 123) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 152) && (jmlHari <= 183)) {
                    System.out.println(nHari + kedepan + (jmlHari - 152) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 183) && (jmlHari <= 213)){
                    System.out.println(nHari + kedepan + (jmlHari - 183) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 213) && (jmlHari <= 244)){
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 244) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 274) && (jmlHari <= 305)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 305) && (jmlHari <= 336)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 336) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " September " + (tahun + 1));
                }else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 123) && (jmlHari <= 151)) {
                    System.out.println(nHari + kedepan + (jmlHari - 123) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 151) && (jmlHari <= 182)) {
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 182) && (jmlHari <= 212)){
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 212) && (jmlHari <= 243)){
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 243) && (jmlHari <= 273)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 273) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 304) && (jmlHari <= 335)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 335) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " September " + (tahun + 1));
                }else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 123) && (jmlHari <= 152)) {
                    System.out.println(nHari + kedepan + (jmlHari - 123) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 152) && (jmlHari <= 183)) {
                    System.out.println(nHari + kedepan + (jmlHari - 152) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 183) && (jmlHari <= 213)){
                    System.out.println(nHari + kedepan + (jmlHari - 183) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 213) && (jmlHari <= 244)){
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 244) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 274) && (jmlHari <= 305)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 305) && (jmlHari <= 336)){
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 336) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " September " + (tahun + 1));
                }else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if(bulan == 11){
            System.out.println("November memiliki hari sebanyak 30");
            
            // Hari ini tanggal //
            if (tanggal <= 30) {
                System.out.println(sekarang + tanggal + " November " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 30;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " November " + tahun);
            } else if (tglBesok == 31) {
                System.out.println(besok + "1 Desember " + tahun);
            } else {
                System.out.println(notValid);
            }

            // N Hari lagi tanggal //
            if (jmlHari <= 30) {
                System.out.println(nHari + kedepan + jmlHari + " November " + tahun);
            } else if ((jmlHari > 30) && (jmlHari <= 61)) {
                System.out.println(nHari + kedepan + (jmlHari - 30) + " Desember " + tahun);
            } else if ((jmlHari > 61) && (jmlHari <= 92)) {
                System.out.println(nHari + kedepan + (jmlHari - 61) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 92) && (jmlHari <= 120)) {
                    System.out.println(nHari + kedepan + (jmlHari - 92) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 120) && (jmlHari <= 151)) {
                    System.out.println(nHari + kedepan + (jmlHari - 120) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 151) && (jmlHari <= 181)){
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 181) && (jmlHari <= 212)){
                    System.out.println(nHari + kedepan + (jmlHari - 181) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 212) && (jmlHari <= 242)){
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 242) && (jmlHari <= 273)){
                    System.out.println(nHari + kedepan + (jmlHari - 242) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 273) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 304) && (jmlHari <= 334)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " September " + (tahun + 1));
                } else if ((jmlHari > 334) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Oktober " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 92) && (jmlHari <= 121)) {
                    System.out.println(nHari + kedepan + (jmlHari - 92) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 121) && (jmlHari <= 152)) {
                    System.out.println(nHari + kedepan + (jmlHari - 121) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 152) && (jmlHari <= 182)){
                    System.out.println(nHari + kedepan + (jmlHari - 152) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 182) && (jmlHari <= 213)){
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 213) && (jmlHari <= 243)){
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 243) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 274) && (jmlHari <= 305)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 305) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " September " + (tahun + 1));
                } else if ((jmlHari > 335) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Oktober " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 92) && (jmlHari <= 120)) {
                    System.out.println(nHari + kedepan + (jmlHari - 92) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 120) && (jmlHari <= 151)) {
                    System.out.println(nHari + kedepan + (jmlHari - 120) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 151) && (jmlHari <= 181)){
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 181) && (jmlHari <= 212)){
                    System.out.println(nHari + kedepan + (jmlHari - 181) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 212) && (jmlHari <= 242)){
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 242) && (jmlHari <= 273)){
                    System.out.println(nHari + kedepan + (jmlHari - 242) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 273) && (jmlHari <= 304)){
                    System.out.println(nHari + kedepan + (jmlHari - 273) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 304) && (jmlHari <= 334)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " September " + (tahun + 1));
                } else if ((jmlHari > 334) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 334) + " Oktober " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 92) && (jmlHari <= 121)) {
                    System.out.println(nHari + kedepan + (jmlHari - 92) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 121) && (jmlHari <= 152)) {
                    System.out.println(nHari + kedepan + (jmlHari - 121) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 152) && (jmlHari <= 182)){
                    System.out.println(nHari + kedepan + (jmlHari - 152) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 182) && (jmlHari <= 213)){
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 213) && (jmlHari <= 243)){
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 243) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 274) && (jmlHari <= 305)){
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 305) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " September " + (tahun + 1));
                } else if ((jmlHari > 335) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " Oktober " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if(bulan == 12){
            System.out.println("Desember memiliki hari sebanyak 31");
            
            // Hari ini tanggal //
            if (tanggal <= 31) {
                System.out.println(sekarang + tanggal + " Desember " + tahun);
            } else {
                System.out.println(notValid);
            }
            
            // Besok tanggal //
            hari = 31;
            if (tglBesok <= hari){
                System.out.println(besok + tglBesok + " Desember " + tahun);
            } else if (tglBesok == 32) {
                System.out.println(besok + "1 Januari " + (tahun + 1));
            } else {
                System.out.println(notValid);
            }

            // N Hari lagi tanggal //
            if (jmlHari <= 31) {
                System.out.println(nHari + kedepan + jmlHari + " Desember " + tahun);
            } else if ((jmlHari > 31) && (jmlHari <= 62)) {
                System.out.println(nHari + kedepan + (jmlHari - 31) + " Januari " + (tahun + 1));
            } else if (tahun % 400 == 0) {
                if((jmlHari > 62) && (jmlHari <= 90)) {
                    System.out.println(nHari + kedepan + (jmlHari - 62) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 90) && (jmlHari <= 121)) {
                    System.out.println(nHari + kedepan + (jmlHari - 90) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 121) && (jmlHari <= 151)){
                    System.out.println(nHari + kedepan + (jmlHari - 121) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 151) && (jmlHari <= 182)){
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 182) && (jmlHari <= 212)){
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 212) && (jmlHari <= 243)){
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 243) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 274) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " September " + (tahun + 1));
                } else if ((jmlHari > 304) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Oktober " + (tahun + 1));
                } else if ((jmlHari > 335) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " November " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                if((jmlHari > 62) && (jmlHari <= 91)) {
                    System.out.println(nHari + kedepan + (jmlHari - 62) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 91) && (jmlHari <= 122)) {
                    System.out.println(nHari + kedepan + (jmlHari - 91) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 122) && (jmlHari <= 152)){
                    System.out.println(nHari + kedepan + (jmlHari - 122) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 152) && (jmlHari <= 183)){
                    System.out.println(nHari + kedepan + (jmlHari - 152) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 183) && (jmlHari <= 213)){
                    System.out.println(nHari + kedepan + (jmlHari - 183) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 213) && (jmlHari <= 244)){
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 244) && (jmlHari <= 275)){
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 275) && (jmlHari <= 305)) {
                    System.out.println(nHari + kedepan + (jmlHari - 275) + " September " + (tahun + 1));
                } else if ((jmlHari > 305) && (jmlHari <= 336)) {
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " Oktober " + (tahun + 1));
                } else if ((jmlHari > 336) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " November " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                if((jmlHari > 62) && (jmlHari <= 90)) {
                    System.out.println(nHari + kedepan + (jmlHari - 62) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 90) && (jmlHari <= 121)) {
                    System.out.println(nHari + kedepan + (jmlHari - 90) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 121) && (jmlHari <= 151)){
                    System.out.println(nHari + kedepan + (jmlHari - 121) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 151) && (jmlHari <= 182)){
                    System.out.println(nHari + kedepan + (jmlHari - 151) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 182) && (jmlHari <= 212)){
                    System.out.println(nHari + kedepan + (jmlHari - 182) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 212) && (jmlHari <= 243)){
                    System.out.println(nHari + kedepan + (jmlHari - 212) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 243) && (jmlHari <= 274)){
                    System.out.println(nHari + kedepan + (jmlHari - 243) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 274) && (jmlHari <= 304)) {
                    System.out.println(nHari + kedepan + (jmlHari - 274) + " September " + (tahun + 1));
                } else if ((jmlHari > 304) && (jmlHari <= 335)) {
                    System.out.println(nHari + kedepan + (jmlHari - 304) + " Oktober " + (tahun + 1));
                } else if ((jmlHari > 335) && (jmlHari <= 365)) {
                    System.out.println(nHari + kedepan + (jmlHari - 335) + " November " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            } else {
                if((jmlHari > 62) && (jmlHari <= 91)) {
                    System.out.println(nHari + kedepan + (jmlHari - 62) + " Februari " + (tahun + 1));
                } else if ((jmlHari > 91) && (jmlHari <= 122)) {
                    System.out.println(nHari + kedepan + (jmlHari - 91) + " Maret " + (tahun + 1));
                } else if ((jmlHari > 122) && (jmlHari <= 152)){
                    System.out.println(nHari + kedepan + (jmlHari - 122) + " April " + (tahun + 1));                    
                } else if ((jmlHari > 152) && (jmlHari <= 183)){
                    System.out.println(nHari + kedepan + (jmlHari - 152) + " Mei " + (tahun + 1)); 
                } else if ((jmlHari > 183) && (jmlHari <= 213)){
                    System.out.println(nHari + kedepan + (jmlHari - 183) + " Juni " + (tahun + 1)); 
                } else if ((jmlHari > 213) && (jmlHari <= 244)){
                    System.out.println(nHari + kedepan + (jmlHari - 213) + " Juli " + (tahun + 1)); 
                } else if ((jmlHari > 244) && (jmlHari <= 275)){
                    System.out.println(nHari + kedepan + (jmlHari - 244) + " Agustus " + (tahun + 1)); 
                } else if ((jmlHari > 275) && (jmlHari <= 305)) {
                    System.out.println(nHari + kedepan + (jmlHari - 275) + " September " + (tahun + 1));
                } else if ((jmlHari > 305) && (jmlHari <= 336)) {
                    System.out.println(nHari + kedepan + (jmlHari - 305) + " Oktober " + (tahun + 1));
                } else if ((jmlHari > 336) && (jmlHari <= 366)) {
                    System.out.println(nHari + kedepan + (jmlHari - 336) + " November " + (tahun + 1));
                } else {
                    System.out.println("maaf, cobalah angka yang lebih kecil dari ini");
                }
            }
        }

        if ((bulan != 1) && (bulan != 2) && (bulan != 3) && (bulan != 4) && (bulan != 5) && (bulan != 6) && (bulan != 7) && (bulan != 8) && (bulan != 9) && (bulan != 10) && (bulan != 11) && (bulan != 12)){
            System.out.println(notValid);
        }

        System.out.println("");
        input.close();
    }

    public static void main(String[] audy) {
        tugasMilik();
        tugasNoEmpat();
    }
}